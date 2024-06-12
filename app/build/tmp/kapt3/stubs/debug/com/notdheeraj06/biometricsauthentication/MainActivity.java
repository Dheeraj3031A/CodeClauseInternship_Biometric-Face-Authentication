package com.notdheeraj06.biometricsauthentication;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\rH\u0002J\u0012\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/notdheeraj06/biometricsauthentication/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "biometricPrompt", "Landroidx/biometric/BiometricPrompt;", "callBack", "Landroidx/biometric/BiometricPrompt$AuthenticationCallback;", "executor", "Ljava/util/concurrent/Executor;", "keyguardManager", "Landroid/app/KeyguardManager;", "authenticateWithBiometrics", "", "biometricsEnrollIntent", "Landroid/content/Intent;", "checkAPILevelAndProceed", "checkDeviceCanAuthenticateWithBiometrics", "getErrorMessage", "", "errorCode", "", "init", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUpDeviceLockInAPIBelow23Intent", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    private androidx.biometric.BiometricPrompt biometricPrompt;
    private java.util.concurrent.Executor executor;
    private androidx.biometric.BiometricPrompt.AuthenticationCallback callBack;
    @org.jetbrains.annotations.Nullable()
    private android.app.KeyguardManager keyguardManager;
    public static final int RC_BIOMETRICS_ENROLL = 10;
    public static final int RC_DEVICE_CREDENTIAL_ENROLL = 18;
    @org.jetbrains.annotations.NotNull()
    public static final com.notdheeraj06.biometricsauthentication.MainActivity.Companion Companion = null;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    private final void init() {
    }
    
    private final void checkDeviceCanAuthenticateWithBiometrics() {
    }
    
    private final android.content.Intent biometricsEnrollIntent() {
        return null;
    }
    
    private final android.content.Intent setUpDeviceLockInAPIBelow23Intent() {
        return null;
    }
    
    private final void checkAPILevelAndProceed() {
    }
    
    private final java.lang.String getErrorMessage(int errorCode) {
        return null;
    }
    
    private final void authenticateWithBiometrics() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/notdheeraj06/biometricsauthentication/MainActivity$Companion;", "", "()V", "RC_BIOMETRICS_ENROLL", "", "RC_DEVICE_CREDENTIAL_ENROLL", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}