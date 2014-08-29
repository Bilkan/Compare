package net.uyghurrdev.avaroid.selishturush;
import java.util.Random;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.text.util.Linkify;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class main extends Activity {
	lazim lzm=new lazim();
    int[] number=new int[2];
    int number1,number2;
    private ImageButton imnumber1;
	private ImageButton imnumber2;
	private ImageButton imtruefalse;
	public Handler hndlr=new Handler();
	private MediaPlayer mMediaPlayer;
	 private boolean sound=true;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        imnumber1 = (ImageButton) findViewById(R.id.imnumber1);
        imnumber2 = (ImageButton) findViewById(R.id.imnumber2);
        imtruefalse= (ImageButton) findViewById(R.id.imtruefalse);
        Next();
        imnumber1.setOnClickListener(new ImageButton.OnClickListener() {
    		public void onClick(View v) {
    			number1();
    			}
    		});
        imnumber2.setOnClickListener(new ImageButton.OnClickListener() {
    		public void onClick(View v) {
    			number2();	
    			}
    		});
        imtruefalse.setOnClickListener(new ImageButton.OnClickListener() {
    		public void onClick(View v) {
    				
    			//imtruefalse.setBackgroundResource(0);
    			//Next();	
    			  
    			  
    			}
    		});
       
        

        
    }
    
    public void Next()
	 {   
   	 
   	
		   Random rnnumber=new Random();
		   //imtruefalse.setVisibility(1);
		  for(int i=0;i<2;i++)
		  {
			  number[i]=rnnumber.nextInt(19); 
			  if(number[0]==number[1])
			  {
				  number[i]=rnnumber.nextInt(19); 
			  }
			  imnumber1.setBackgroundResource(lzm.mynumber1[number[0]]);
			  number1=number[0];
			  imnumber2.setBackgroundResource(lzm.mynumber2[number[1]]);
			  number2=number[1];
		  }
	 }
    public void number1(){
    	
   	 Random rn=new Random();
    	//int j=rn.nextInt(2); 
       	if(number1>number2){
   			
       		//imtruefalse.setBackgroundResource(lzm.mytrue[j]);
       		aa();
       		hndlr.postDelayed( new Runnable() {
       	        public void run() {
       	        	Next();	
       	        }
       	        },2000);
       		toast(); 
   			player(0);
   			
   		}
       	else 
       		if(number1<number2)
       	{
       		//imtruefalse.setBackgroundResource(lzm.myfalse[j]);
       		//bb();
       		Next();
       		player(1);
       		Toast toast = new Toast(this); 
    	    ImageView view = new ImageView(this); 
    	    view.setImageResource(R.drawable.cry);
    	    toast.setGravity(Gravity.VERTICAL_GRAVITY_MASK,toast.getXOffset()/2,toast.getYOffset());
    	    toast.setView(view); 
    	    toast.show();
       	}
       	
       	
       }
 public void number2(){
    	
    	
    	Random rn=new Random();
    	//int j=rn.nextInt(2); 
    	
    	if(number2>number1){
			
    		//imtruefalse.setBackgroundResource(lzm.mytrue[j]);
    		
    		
    		bb();
    		hndlr.postDelayed( new Runnable() {
       	        public void run() {
       	        	Next();	
       	        }
       	        },2000);
			player(0);
			toast();

		}
    	else
    		
    	if(number2<number1)
    	{
    		//imtruefalse.setBackgroundResource(lzm.myfalse[j]);
    		
    		//aa();
    		Next();
    		player(1);
    		Toast toast = new Toast(this); 
    	    ImageView view = new ImageView(this); 
    	    view.setImageResource(R.drawable.cry);
    	    toast.setGravity(Gravity.VERTICAL_GRAVITY_MASK,toast.getXOffset()/2,toast.getYOffset());
    	    toast.setView(view); 
    	    toast.show();
    	}
    	
    }
 
 public void aa(){
	 
	  Animation anim = null;
	  Animation ani = null;
	  Animation an = null;
	  anim = new RotateAnimation(0, +7.0f,Animation.RELATIVE_TO_SELF,-0.53f,Animation.RELATIVE_TO_SELF,1.2f);
	  ani = new RotateAnimation(0, +7.0f,Animation.RELATIVE_TO_SELF,+1.53f,Animation.RELATIVE_TO_SELF,1.2f);
	  an = new RotateAnimation(0,7,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
	  anim.setInterpolator(new getInterpolation());
	  ani.setInterpolator(new getInterpolation());
	  an.setInterpolator(new getInterpolation());
	  anim.setDuration(1000);
	  ani.setDuration(1000);
	  an.setDuration(1000);
	  imnumber1.startAnimation(anim);
	  imnumber2.startAnimation(ani);
	  imtruefalse.startAnimation(an);
 }
public void bb(){
	 
	 Animation anim = null;
	  Animation ani = null;
	  Animation an = null;
	  anim = new RotateAnimation(0.0f, -7.0f,Animation.RELATIVE_TO_SELF,-0.5f,Animation.RELATIVE_TO_SELF,0.5f);
	  ani = new RotateAnimation(0.0f, -7.0f,Animation.RELATIVE_TO_SELF,1.50f,Animation.RELATIVE_TO_SELF,0.5f);
	  an = new RotateAnimation(0.0f, -7.0f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
	  anim.setInterpolator(new getInterpolation());
	  ani.setInterpolator(new getInterpolation());
	  an.setInterpolator(new getInterpolation());
	  anim.setDuration(1000);
	  ani.setDuration(1000);
	  an.setDuration(1000);
	  imnumber1.startAnimation(anim);
	  imnumber2.startAnimation(ani);
      imtruefalse.startAnimation(an);
	 
 }
public void player(int i)
{
	  if(sound==true){
		     if(mMediaPlayer!=null)
		     {
		    	
		       	 mMediaPlayer.release();
		       
		     }
	  mMediaPlayer=MediaPlayer.create(main.this,lzm.mymp3[i]);
   	  mMediaPlayer.start();
	   }
	else if (sound==false){ 
		if(mMediaPlayer!=null){
		
		mMediaPlayer.stop();
	    }
	      }
	 
}
public void toast()
{
	Toast toast = new Toast(this); 
    ImageView view = new ImageView(this); 
    view.setImageResource(R.drawable.s);
    toast.setGravity(Gravity.TOP,toast.getXOffset()/2,toast.getYOffset());
    toast.setView(view); 
    toast.show(); 
}
 
public boolean onCreateOptionsMenu(Menu menu) { 
    
	
	 menu.add(0, 1, 1,"ئاۋازنى تاقاش").setIcon(R.drawable.sound); 
	
	 menu.add(0,2,2, "توغرىسىدا").setIcon(R.drawable.about_icon); 
	
	 return super.onCreateOptionsMenu(menu);   
	 }

public boolean onOptionsItemSelected(MenuItem item) 
{
	 // TODO Auto-generated method stub        
	 if(item.getItemId() == 1){  
		 
		 if(sound==true){
				
			    Toast toast = new Toast(this); 
			    ImageView view = new ImageView(this); 
			    view.setImageResource(R.drawable.off);
			    //toast.setGravity(Gravity.CENTER,toast.getXOffset()/2,toast.getYOffset()/2);
			    toast.setView(view); 
			    toast.show();
			    sound=false;
			       }
		      else
		      {
			 Toast toast = new Toast(this); 
			    ImageView view = new ImageView(this); 
			    view.setImageResource(R.drawable.on);
			    //toast.setGravity(Gravity.CENTER,toast.getXOffset()/2,toast.getYOffset()/2);
			    toast.setView(view); 
			    toast.show();
			    sound=true;}
		
	                 }
	else  if(item.getItemId() == 2){
		 About(main.this);
		
		 }
	
	 return true;
	 
	 }
	 
	 
	 

private void About(Context context) {  
    LayoutInflater inflater = LayoutInflater.from(this);  
    final View textEntryView = inflater.inflate(R.layout.aboutdialog, null); 
    
    final TextView about=(TextView)textEntryView.findViewById(R.id.txtabout);
    about.setText("بىلكان ئېلېكتىرون پەن- تېخنىكا چەكلىك شىركىتى");  
    final TextView txtlink=(TextView)textEntryView.findViewById(R.id.txtlink);
    txtlink.setText("www.bilkan.net");  
    Linkify.addLinks(txtlink, Linkify.ALL);  
    final AlertDialog.Builder builder = new AlertDialog.Builder(context);  
       builder.setCancelable(false);  
       builder.setIcon(R.drawable.avar);  
       builder.setTitle("چوڭ كىچىكلىكنى سېلىشتۇرۇش"); 
       builder.setMessage("               نەشرى1.1.1 ");
       builder.setView(textEntryView);  
        /*builder.setPositiveButton("确认",  
               new DialogInterface.OnClickListener() {  
                    public void onClick(DialogInterface dialog, int whichButton) {  
                     setTitle(edtInput.getText());  
                    }  
               });  */
        builder.setNegativeButton("تاقاش",  
                new DialogInterface.OnClickListener() {  
             public void onClick(DialogInterface dialog, int whichButton) {  
                     setTitle("");  
               }  
          });  
     builder.show();  
   }  


}