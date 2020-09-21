package evento.aitr.vjsb.evento;

import android.support.annotation.NonNull;

import com.google.firebase.firestore.Exclude;

@SuppressWarnings("ALL")
public class BlogPostId {

    @Exclude
    public String BlogPostId;

    public <T extends BlogPostId> T withId(@NonNull final String id) {
        this.BlogPostId = id;
        return (T) this;
    }

}
