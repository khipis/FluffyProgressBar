import com.intellij.ide.ui.LafManager;

import javax.swing.*;

public class FluffyApplicationComponent {
    public FluffyApplicationComponent() {
        LafManager.getInstance().addLafManagerListener(__ -> updateProgressBarUi());
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", FluffyProgressBarUi.class.getName());
        UIManager.getDefaults().put(FluffyProgressBarUi.class.getName(), FluffyProgressBarUi.class);
    }
}
