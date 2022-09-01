import java.util.ArrayList;
import java.util.List;

public class Channel {
    String name;
    List<Viewer> viewers;

    public Channel(String name) {
        this.name = name;
        this.viewers = new ArrayList<Viewer>();
    }

    public void addViewer(Viewer viewer) {
        this.viewers.add(viewer);
    }

    public void removeViewer(Viewer viewer) {
        this.viewers.remove(viewer);
    }

    public int getViewerCount() {
        return this.viewers.size();
    }

    public int getViews() {
        int views = 0;
        for (Viewer viewer : this.viewers) {
            views += viewer.count;
        }
        return views;
    }
}
