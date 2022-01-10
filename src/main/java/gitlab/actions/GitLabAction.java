package gitlab.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.Project;
import gitlab.ui.GitLabDialog;

/**
 *
 *
 * @author Lv LiFeng
 * @date 2022/1/6 20:10
 */
public class GitLabAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {

        Project project = e.getRequiredData(CommonDataKeys.PROJECT);

        GitLabDialog dialog = new GitLabDialog(project);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);

//        Map<GitlabServerDto, Collection<ProjectDto>> gitlabServerDtoCollectionMap = new GitLabSettingsState().loadMapOfServersAndProjects(list);
//        gitlabServerDtoCollectionMap.values().stream().forEach(o -> System.out.println(o.size()));

//        Project project = e.getRequiredData(CommonDataKeys.PROJECT);
//        CheckoutProvider.Listener checkoutListener = ProjectLevelVcsManager.getInstance(project).getCompositeCheckoutListener();
//        VcsCloneDialog dialog = new VcsCloneDialog.Builder(project).forVcs(GitCheckoutProvider.class);
//        if (dialog.showAndGet()) {
//            dialog.doClone(checkoutListener);
//        }
    }
}