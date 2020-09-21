package evento.aitr.vjsb.evento;

import android.support.annotation.NonNull;

import com.google.firebase.firestore.Exclude;

@SuppressWarnings("ALL")
public class ChatPostId {

    @Exclude
    public String ChatPostId;

    public <TT extends ChatPostId> TT withId(@NonNull final String id) {
        this.ChatPostId = id;
        //noinspection unchecked
        return (TT) this;
    }

}
