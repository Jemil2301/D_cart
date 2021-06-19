package com.example.i.loginpage;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Adapterl10 extends PagerAdapter

{
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] image={R.drawable.l10,R.drawable.l11,R.drawable.l12};
    public Adapterl10(Context context) {
        this.context=context;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.custome_layoutb1,null);
        ImageView imageView=(ImageView)view.findViewById(R.id.myImageView1);
        imageView.setImageResource(image[position]);
        ViewPager viewPager=(ViewPager)container;
        viewPager.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager viewPager=(ViewPager)container;
        View view =(View)object;
        viewPager.removeView(view);
    }
}

