package com.intellij.testFramework.vcs;

import com.intellij.openapi.application.ModalityState;
import com.intellij.openapi.vcs.FilePath;
import com.intellij.openapi.vcs.FileStatus;
import com.intellij.openapi.vcs.changes.*;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.util.Consumer;
import com.intellij.util.continuation.ContinuationPause;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * @author Kirill Likhodedov
 */
public class MockChangeListManager extends ChangeListManager {

  private Collection<Change> myChanges = new HashSet<Change>();

  public void addChanges(Change... changes) {
    myChanges.addAll(Arrays.asList(changes));
  }

  @Override
  public void scheduleUpdate() {
    throw new UnsupportedOperationException();
  }

  @Override
  public void scheduleUpdate(boolean updateUnversionedFiles) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void invokeAfterUpdate(Runnable afterUpdate,
                                InvokeAfterUpdateMode mode,
                                String title,
                                ModalityState state) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void invokeAfterUpdate(Runnable afterUpdate,
                                InvokeAfterUpdateMode mode,
                                String title,
                                Consumer<VcsDirtyScopeManager> dirtyScopeManager,
                                ModalityState state) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean ensureUpToDate(boolean canBeCanceled) {
    throw new UnsupportedOperationException();
  }

  @Override
  public List<LocalChangeList> getChangeListsCopy() {
    throw new UnsupportedOperationException();
  }

  @NotNull
  @Override
  public List<LocalChangeList> getChangeLists() {
    throw new UnsupportedOperationException();
  }

  @Override
  public List<File> getAffectedPaths() {
    throw new UnsupportedOperationException();
  }

  @NotNull
  @Override
  public List<VirtualFile> getAffectedFiles() {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isFileAffected(VirtualFile file) {
    throw new UnsupportedOperationException();
  }

  @NotNull
  @Override
  public Collection<Change> getAllChanges() {
    return myChanges;
  }

  @Override
  public LocalChangeList findChangeList(String name) {
    throw new UnsupportedOperationException();
  }

  @Override
  public LocalChangeList getChangeList(String id) {
    throw new UnsupportedOperationException();
  }

  @Override
  public LocalChangeList getDefaultChangeList() {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isDefaultChangeList(ChangeList list) {
    throw new UnsupportedOperationException();
  }

  @Override
  public LocalChangeList getChangeList(Change change) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getChangeListNameIfOnlyOne(Change[] changes) {
    throw new UnsupportedOperationException();
  }

  @NotNull
  @Override
  public Runnable prepareForChangeDeletion(Collection<Change> changes) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Change getChange(@NotNull VirtualFile file) {
    throw new UnsupportedOperationException();
  }

  @Override
  public LocalChangeList getChangeList(@NotNull VirtualFile file) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Change getChange(FilePath file) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isUnversioned(VirtualFile file) {
    throw new UnsupportedOperationException();
  }

  @NotNull
  @Override
  public FileStatus getStatus(VirtualFile file) {
    throw new UnsupportedOperationException();
  }

  @NotNull
  @Override
  public Collection<Change> getChangesIn(VirtualFile dir) {
    throw new UnsupportedOperationException();
  }

  @NotNull
  @Override
  public Collection<Change> getChangesIn(FilePath path) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void addChangeListListener(ChangeListListener listener) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void removeChangeListListener(ChangeListListener listener) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void registerCommitExecutor(CommitExecutor executor) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void commitChanges(LocalChangeList changeList, List<Change> changes) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void commitChangesSynchronously(LocalChangeList changeList, List<Change> changes) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean commitChangesSynchronouslyWithResult(LocalChangeList changeList, List<Change> changes) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void reopenFiles(List<FilePath> paths) {
    throw new UnsupportedOperationException();
  }

  @Override
  public List<CommitExecutor> getRegisteredExecutors() {
    throw new UnsupportedOperationException();
  }

  @Override
  public void addFilesToIgnore(IgnoredFileBean... ignoredFiles) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void setFilesToIgnore(IgnoredFileBean... ignoredFiles) {
    throw new UnsupportedOperationException();
  }

  @Override
  public IgnoredFileBean[] getFilesToIgnore() {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isIgnoredFile(@NotNull VirtualFile file) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getSwitchedBranch(VirtualFile file) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getDefaultListName() {
    throw new UnsupportedOperationException();
  }

  @Override
  public void freeze(ContinuationPause context, String reason) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void letGo() {
    throw new UnsupportedOperationException();
  }

  @Override
  public String isFreezed() {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isFreezedWithNotification(@Nullable String modalTitle) {
    throw new UnsupportedOperationException();
  }

  @Override
  public List<VirtualFile> getModifiedWithoutEditing() {
    throw new UnsupportedOperationException("Not implemented");
  }

  @Override
  public LocalChangeList addChangeList(@NotNull String name, @Nullable String comment) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void setDefaultChangeList(@NotNull LocalChangeList list) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void removeChangeList(String name) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void removeChangeList(LocalChangeList list) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void moveChangesTo(LocalChangeList list, Change[] changes) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean setReadOnly(String name, boolean value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean editName(@NotNull String fromName, @NotNull String toName) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String editComment(@NotNull String fromName, String newComment) {
    throw new UnsupportedOperationException();
  }
}
