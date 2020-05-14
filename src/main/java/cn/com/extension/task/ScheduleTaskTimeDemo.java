package cn.com.extension.task;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : yinchao
 * @create 2020/5/9 5:34 下午
 */
public class ScheduleTaskTimeDemo {
    private static final ScheduledExecutorService schedule = Executors.newScheduledThreadPool(
            1,
            new ThreadFactoryBuilder()
                    .setNameFormat("RedisConsumerESTask-%d")
                    .setDaemon(false)
                    .build());

    public static void main(String[] args) {
        schedule.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                getMessage();
            }
        }, 0, 1, TimeUnit.SECONDS);

    }

    private static void getMessage() {
        try{
            System.out.println("定时任务正在运行");
            int a = 1/0;
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
