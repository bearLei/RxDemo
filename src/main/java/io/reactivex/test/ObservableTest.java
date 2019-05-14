package io.reactivex.test;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * author : lei
 * e-mail : xiong.lei@ubtrobot.com
 * date   : 2019/5/13 19:44
 * desc   :
 * version: 1.0
 */
public class ObservableTest {
    public static final void main(String[] args){
     testObservable();
    }


    private static void testObservable(){
        System.out.println("打印---->");
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                System.out.println("打印---->subScibe");

                for (int i = 0; i < 10; i++) {
                    emitter.onNext(i);
                }
            }
        })
                .subscribe(new Observer<Integer>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println("打印---->onSubScibe");
                    }

                    @Override
                    public void onNext(Integer integer) {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
