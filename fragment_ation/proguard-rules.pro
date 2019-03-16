# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

-printmapping mapping.txt

#EventBus
-keepattributes *Annotation*
-keepclassmembers class ** {
    @org.greenrobot.eventbus.Subscribe <methods>;
}
-keep enum org.greenrobot.eventbus.ThreadMode { *; }

# Fragmentation
-keep class * extends android.support.v4.app.FragmentManager{ *; }

-keepclassmembers class * extends androidx.appcompat.app.AppCompatActivity {
   public int getContainerViewId();
   public boolean onRiggerBackPressed();
   public void onFragmentResult(int,int,android.os.Bundle);
   public void onLazyLoadViewCreated(android.os.Bundle);
   public int[] getPuppetAnimations();
   public String getFragmentTag();
   public boolean onInterruptBackPressed();
}
-keepclassmembers class * extends androidx.fragment.app.Fragment {
   public int getContainerViewId();
   public boolean onRiggerBackPressed();
   public void onFragmentResult(int,int,android.os.Bundle);
   public void onLazyLoadViewCreated(android.os.Bundle);
   public int[] getPuppetAnimations();
   public String getFragmentTag();
   public boolean onInterruptBackPressed();
}
-keep class * extends android.support.v4.app.FragmentManager{ *; }
-keepclasseswithmembernames class android.support.v4.widget.ViewDragHelper{ *; }
-keepclasseswithmembernames class androidx.customview.widget.ViewDragHelper{ *; }

-keep class * extends androidx.fragment.app.FragmentManager{ *; }

