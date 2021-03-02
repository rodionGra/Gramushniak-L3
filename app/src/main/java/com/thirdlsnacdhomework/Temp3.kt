import java.util.*

class ZhengFuObservable : Observable() {
    /**
     * Policy update
     */
    fun policyUpdate(policy: String) {
        println("Government policy changed")

        setChanged()
        notifyObservers(policy)
    }

    /**
     * Policy changes
     */
    fun policyCancel(policy: String) {
        println("Government policy cancelled")

        setChanged()
        notifyObservers()
    }

    fun addObsFromClass(obj: Observer){
        this.addObserver(obj)
    }

}

class MaYun : Observer {

    override fun update(o: Observable?, arg: Any?) {
        notifyAlibabaCompany(arg.toString())
    }

    /**
     * Notify the company's employee policy changes
     */
    fun notifyAlibabaCompany(msg: String) {
        println("Alibaba employee::$msg")
    }
}

class MaHuaTeng : Observer {

    override fun update(o: Observable?, arg: Any?) {
        notifyTencentCompany(arg.toString())
    }

    /**
     * Notify the company's employee policy changes
     */
    fun notifyTencentCompany(msg: String) {
        println("Tencent employees::$msg")
    }

}

class LiYanHong : Observer {

    override fun update(o: Observable?, arg: Any?) {
        notifyBaiDuCompany(arg.toString())
    }

    /**
     * Notify the company's employee policy changes
     */
    fun notifyBaiDuCompany(msg: String) {
        println(" ::$msg")
    }
}

fun main() {
    var zhengfu = ZhengFuObservable()

    var maYun = MaYun()
    var maHuaTeng = MaHuaTeng()
    var liYanHong = LiYanHong()

    /*zhengfu.addObserver(maYun)
    zhengfu.addObserver(maHuaTeng)
    zhengfu.addObserver(liYanHong)*/

    zhengfu.addObsFromClass(maYun)
    zhengfu.addObsFromClass(maHuaTeng)
    zhengfu.addObsFromClass(liYanHong)

    zhengfu.policyUpdate("Third-party payment license changed")
}