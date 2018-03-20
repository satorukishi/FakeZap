package br.com.satoruchannel.fakezap.firebase.fcm

import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService
import com.orhanobut.hawk.Hawk

class MeuFirebaseInstanceIdService : FirebaseInstanceIdService() {

    // é chamado sempre que tiver uma atualização no Token
    override fun onTokenRefresh() {
        super.onTokenRefresh()
        Hawk.put("TOKENFIREBASE", FirebaseInstanceId.getInstance().token)

    }
}