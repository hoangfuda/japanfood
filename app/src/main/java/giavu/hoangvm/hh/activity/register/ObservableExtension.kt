package giavu.hoangvm.hh.activity.register


import io.reactivex.Observable
import io.reactivex.rxkotlin.Observables
import org.reactivestreams.Publisher

/**
 * @Author: Hoang Vu
 * @Date:   2019/01/14
 */
fun <T1, T2, T3> combineLatest(source1: Publisher<T1>,
                           source2: Publisher<T2>,
                           source3: Publisher<T3>): Observable<Triple<T1, T2, T3>> {
    return Observables.combineLatest(
            source1 = Observable.fromPublisher(source1),
            source2 = Observable.fromPublisher(source2),
            source3 = Observable.fromPublisher(source3)
    )
}