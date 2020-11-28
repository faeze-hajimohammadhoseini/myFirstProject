package com.example.myapplication;

import android.content.Context;

import androidx.core.content.res.ResourcesCompat;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    public static List<User> getUsers(Context context){
        List<User> users=new ArrayList<>();

        for (int i=0;i<7;i++){
            User u=new User();
            u.setId(i);

            switch (i){
                case 0:
                    u.setItemImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.zero,null));
                    u.setTitle("QUARANTINE");
                    u.setContent("Things You Can Do at Home Right Now in quarantine");
                    u.setDate("2 hour ago");
                    break;
                case 1:
                    u.setItemImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.one,null));
                    u.setTitle("EXERCISE");
                    u.setContent("you can do exercise in your home and keep your body health and fix it. ");
                    u.setDate("9 hour ago");
                    break;
                case 2:

                    u.setItemImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.two,null));
                    u.setTitle("DO YOUR HOMEWORK");
                    u.setContent("Okay, at first I thought learning at home would be fun. Staying at home in pajamas and not having to wake up early sounds pretty great. Well, I was half-wrong. Don’t get me wrong, I love not having to wake up at 5:30 in the morning to go to school. In fact, it is probably one of the best parts about being taught at home. Though not being able to go to school and see your friends in person, it can make you feel a bit lonely. That’s one of the down parts about this, but the learning itself isn’t that bad. Overall, I think that the whole quarantine thing isn’t as bad as some people make it out to be. Sure, it’s definitely not as fun as going to school and meeting your friends, but at least it’s a little bit quieter than the noisy classroom. ");
                    u.setDate("12 hour ago");
                    break;
                case 3:
                    u.setItemImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.three,null));
                    u.setTitle("CHAT WITH YOUR FRIENDS");
                    u.setContent("Social distancing gives a whole new meaning to the phrase \"I miss your face.\" Case in point: I, Louryn, hadn't seen my best friend in so long due to the coronavirus, I didn't even know she'd gotten bangs. Enough is enough! Show off your kids to grandma or show off your cat to your pet-less pals using one of these video services.");
                    u.setDate("1 day ago");
                    break;
                case 4:
                    u.setItemImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.four,null));
                    u.setTitle("TAKE PHOTO");
                    u.setContent("you can stay at home and take photo of yourself...");
                    u.setDate("3 day ago");
                    break;
                case 5:
                    u.setItemImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.five,null));
                    u.setTitle("GO TO THE PARK");
                    u.setContent("you can go to the park and enjoy walking ");
                    u.setDate("5 day ago");
                    break;
                case 6:
                    u.setItemImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.six,null));
                    u.setTitle("READING");
                    u.setContent("There are so many books waiting to be read during your time at home. Check out these local online bookstores with their wide array of fiction and non-fiction titles.");
                    u.setDate("1 week ago");
                    break;
            }


            users.add(u);
        }

    return users;
    }
}




