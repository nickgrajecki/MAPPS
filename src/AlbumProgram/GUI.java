package AlbumProgram;

import AlbumProgram.Album;
import AlbumProgram.AlbumCollection;
import AlbumProgram.Playlist;
import AlbumProgram.PlaylistTrack;
import AlbumProgram.Track;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.filechooser.FileSystemView;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GUI extends javax.swing.JFrame {

    private AlbumCollection loadCollection;
    private Playlist loadPlaylist;
    private DefaultListModel collectionModel = new DefaultListModel();
    private DefaultListModel playlistModel = new DefaultListModel();
    private DefaultListModel albumTracksModel = new DefaultListModel();
    private DefaultListModel newPlaylistModel = new DefaultListModel();
    private DefaultListModel chooseAlbumTracksModel = new DefaultListModel();
    private MP3Player0 mp3;

    public GUI() {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createNewPlaylistDialog = new javax.swing.JDialog();
        addAlbumTrack = new javax.swing.JButton();
        addPlaylistTrack = new javax.swing.JButton();
        popupCollectionPanel = new javax.swing.JPanel();
        albumScrollPop = new javax.swing.JScrollPane();
        chooseAlbum = new javax.swing.JList<>();
        trackScrollPop = new javax.swing.JScrollPane();
        chooseTrack = new javax.swing.JList<>();
        playlistPopPanel = new javax.swing.JPanel();
        playlistScrollPop = new javax.swing.JScrollPane();
        choosePlaylistTrack = new javax.swing.JList<>();
        newPlaylistPanel = new javax.swing.JPanel();
        newPlaylistScroll = new javax.swing.JScrollPane();
        selectedTracks = new javax.swing.JList<>();
        removeTrack = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        playlistPopup = new javax.swing.JDialog();
        playlistPopLabel = new javax.swing.JLabel();
        closePPopup = new javax.swing.JButton();
        collectionPopup = new javax.swing.JDialog();
        choicePopLabel = new javax.swing.JLabel();
        mergeButton = new javax.swing.JButton();
        createNewButton = new javax.swing.JButton();
        collectionCancel = new javax.swing.JButton();
        playlistWarning = new javax.swing.JDialog();
        warningPT1 = new javax.swing.JLabel();
        warningPT2 = new javax.swing.JLabel();
        warningOK = new javax.swing.JButton();
        collectionPanel = new javax.swing.JPanel();
        collectionScroll = new javax.swing.JScrollPane();
        cList = new JList(collectionModel);
        loadCButton = new javax.swing.JButton();
        albumDetails = new javax.swing.JPanel();
        albumImage = new javax.swing.JLabel();
        albumScroll = new javax.swing.JScrollPane();
        albumTracks = new JList(albumTracksModel);
        albumArtist = new javax.swing.JLabel();
        albumTitle = new javax.swing.JLabel();
        totalDuration = new javax.swing.JLabel();
        artistText = new javax.swing.JLabel();
        albumText = new javax.swing.JLabel();
        totalDurationText = new javax.swing.JLabel();
        playButton = new javax.swing.JLabel();
        stopButton = new javax.swing.JLabel();
        playlistPanel = new javax.swing.JPanel();
        playlistScroll = new javax.swing.JScrollPane();
        pList = new JList(playlistModel);
        plName = new javax.swing.JLabel();
        plDuration = new javax.swing.JLabel();
        loadPButton = new javax.swing.JButton();
        plNameLabel = new javax.swing.JLabel();
        plDurationLabel = new javax.swing.JLabel();
        trackDurationLabel = new javax.swing.JLabel();
        trackDuration = new javax.swing.JLabel();
        centrePanel = new javax.swing.JPanel();
        nowPlaying = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        createPlaylist = new javax.swing.JMenu();
        createPlaylistMenu = new javax.swing.JMenuItem();

        createNewPlaylistDialog.setTitle("Create a new playlist");

        addAlbumTrack.setIcon(new javax.swing.ImageIcon("C:\\Users\\thegr\\Desktop\\CW2\\MAPPS\\data\\down-arrow.png")); // NOI18N
        addAlbumTrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAlbumTrackActionPerformed(evt);
            }
        });

        addPlaylistTrack.setIcon(new javax.swing.ImageIcon("C:\\Users\\thegr\\Desktop\\CW2\\MAPPS\\data\\down-arrow.png")); // NOI18N
        addPlaylistTrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlaylistTrackActionPerformed(evt);
            }
        });

        chooseAlbum.setModel(collectionModel);
        chooseAlbum.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                chooseAlbumValueChanged(evt);
            }
        });
        albumScrollPop.setViewportView(chooseAlbum);

        chooseTrack.setModel(chooseAlbumTracksModel);
        trackScrollPop.setViewportView(chooseTrack);

        javax.swing.GroupLayout popupCollectionPanelLayout = new javax.swing.GroupLayout(popupCollectionPanel);
        popupCollectionPanel.setLayout(popupCollectionPanelLayout);
        popupCollectionPanelLayout.setHorizontalGroup(
            popupCollectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(albumScrollPop, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
            .addComponent(trackScrollPop)
        );
        popupCollectionPanelLayout.setVerticalGroup(
            popupCollectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popupCollectionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(albumScrollPop, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trackScrollPop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        choosePlaylistTrack.setModel(playlistModel);
        playlistScrollPop.setViewportView(choosePlaylistTrack);

        javax.swing.GroupLayout playlistPopPanelLayout = new javax.swing.GroupLayout(playlistPopPanel);
        playlistPopPanel.setLayout(playlistPopPanelLayout);
        playlistPopPanelLayout.setHorizontalGroup(
            playlistPopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlistPopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playlistScrollPop, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playlistPopPanelLayout.setVerticalGroup(
            playlistPopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(playlistScrollPop, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );

        selectedTracks.setModel(newPlaylistModel);
        newPlaylistScroll.setViewportView(selectedTracks);

        removeTrack.setText("Remove track");
        removeTrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTrackActionPerformed(evt);
            }
        });

        clearButton.setText("Clear all tracks");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save to file");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newPlaylistPanelLayout = new javax.swing.GroupLayout(newPlaylistPanel);
        newPlaylistPanel.setLayout(newPlaylistPanelLayout);
        newPlaylistPanelLayout.setHorizontalGroup(
            newPlaylistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newPlaylistPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(newPlaylistScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(newPlaylistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeTrack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(saveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        newPlaylistPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clearButton, removeTrack});

        newPlaylistPanelLayout.setVerticalGroup(
            newPlaylistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newPlaylistPanelLayout.createSequentialGroup()
                .addGroup(newPlaylistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(newPlaylistPanelLayout.createSequentialGroup()
                        .addComponent(removeTrack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton))
                    .addComponent(newPlaylistScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout createNewPlaylistDialogLayout = new javax.swing.GroupLayout(createNewPlaylistDialog.getContentPane());
        createNewPlaylistDialog.getContentPane().setLayout(createNewPlaylistDialogLayout);
        createNewPlaylistDialogLayout.setHorizontalGroup(
            createNewPlaylistDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createNewPlaylistDialogLayout.createSequentialGroup()
                .addGroup(createNewPlaylistDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createNewPlaylistDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(popupCollectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playlistPopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(createNewPlaylistDialogLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(createNewPlaylistDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createNewPlaylistDialogLayout.createSequentialGroup()
                                .addComponent(addAlbumTrack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                                .addComponent(addPlaylistTrack)
                                .addGap(157, 157, 157))
                            .addComponent(newPlaylistPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        createNewPlaylistDialogLayout.setVerticalGroup(
            createNewPlaylistDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createNewPlaylistDialogLayout.createSequentialGroup()
                .addGroup(createNewPlaylistDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(popupCollectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playlistPopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(createNewPlaylistDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPlaylistTrack)
                    .addComponent(addAlbumTrack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newPlaylistPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        playlistPopup.setTitle("Load collection first");

        playlistPopLabel.setText("Load a collection of albums first!");

        closePPopup.setText("OK");
        closePPopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closePPopupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout playlistPopupLayout = new javax.swing.GroupLayout(playlistPopup.getContentPane());
        playlistPopup.getContentPane().setLayout(playlistPopupLayout);
        playlistPopupLayout.setHorizontalGroup(
            playlistPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlistPopupLayout.createSequentialGroup()
                .addGroup(playlistPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playlistPopupLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(playlistPopLabel))
                    .addGroup(playlistPopupLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(closePPopup)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        playlistPopupLayout.setVerticalGroup(
            playlistPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlistPopupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playlistPopLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closePPopup)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        collectionPopup.setTitle("Choose how to proceed");

        choicePopLabel.setText("Would you like to merge this collection with the existing list or create a new one?");

        mergeButton.setText("Merge");
        mergeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mergeButtonActionPerformed(evt);
            }
        });

        createNewButton.setText("Create New");
        createNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewButtonActionPerformed(evt);
            }
        });

        collectionCancel.setText("Cancel");
        collectionCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectionCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout collectionPopupLayout = new javax.swing.GroupLayout(collectionPopup.getContentPane());
        collectionPopup.getContentPane().setLayout(collectionPopupLayout);
        collectionPopupLayout.setHorizontalGroup(
            collectionPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(collectionPopupLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(mergeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createNewButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, collectionPopupLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(collectionPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(choicePopLabel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, collectionPopupLayout.createSequentialGroup()
                        .addComponent(collectionCancel)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        collectionPopupLayout.setVerticalGroup(
            collectionPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(collectionPopupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(choicePopLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(collectionPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mergeButton)
                    .addComponent(createNewButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(collectionCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        playlistWarning.setTitle("No albums found");

        warningPT1.setText("One or more tracks do not have a corresponding album on the loaded collection.");

        warningPT2.setText("Please update your collection to proceed.");

        warningOK.setText("OK");
        warningOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warningOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout playlistWarningLayout = new javax.swing.GroupLayout(playlistWarning.getContentPane());
        playlistWarning.getContentPane().setLayout(playlistWarningLayout);
        playlistWarningLayout.setHorizontalGroup(
            playlistWarningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlistWarningLayout.createSequentialGroup()
                .addGroup(playlistWarningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playlistWarningLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(playlistWarningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(warningPT1)
                            .addComponent(warningPT2)))
                    .addGroup(playlistWarningLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(warningOK)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        playlistWarningLayout.setVerticalGroup(
            playlistWarningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlistWarningLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warningPT1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warningPT2)
                .addGap(18, 18, 18)
                .addComponent(warningOK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Music Album and Playlist Playing System");
        setName("Main Program"); // NOI18N

        cList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                cListValueChanged(evt);
            }
        });
        collectionScroll.setViewportView(cList);

        loadCButton.setText("Load Collection");
        loadCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadCButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout collectionPanelLayout = new javax.swing.GroupLayout(collectionPanel);
        collectionPanel.setLayout(collectionPanelLayout);
        collectionPanelLayout.setHorizontalGroup(
            collectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(collectionPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(collectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collectionScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        collectionPanelLayout.setVerticalGroup(
            collectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(collectionPanelLayout.createSequentialGroup()
                .addComponent(collectionScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadCButton))
        );

        albumImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        albumImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\thegr\\Desktop\\CW2\\MAPPS\\data\\albumimages\\noimage.jpg")); // NOI18N

        albumTracks.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                albumTracksValueChanged(evt);
            }
        });
        albumScroll.setViewportView(albumTracks);

        artistText.setText("Artist:");

        albumText.setText("Album:");

        totalDurationText.setText("Duration:");

        javax.swing.GroupLayout albumDetailsLayout = new javax.swing.GroupLayout(albumDetails);
        albumDetails.setLayout(albumDetailsLayout);
        albumDetailsLayout.setHorizontalGroup(
            albumDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(albumDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(albumDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(albumScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(albumDetailsLayout.createSequentialGroup()
                        .addGroup(albumDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(albumDetailsLayout.createSequentialGroup()
                                .addComponent(artistText)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(albumDetailsLayout.createSequentialGroup()
                                .addGroup(albumDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(albumText)
                                    .addComponent(totalDurationText))
                                .addGap(18, 18, 18)
                                .addGroup(albumDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalDuration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(albumDetailsLayout.createSequentialGroup()
                                        .addGroup(albumDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(albumArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(albumTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(albumDetailsLayout.createSequentialGroup()
                        .addComponent(albumImage)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        albumDetailsLayout.setVerticalGroup(
            albumDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(albumDetailsLayout.createSequentialGroup()
                .addComponent(albumImage)
                .addGap(6, 6, 6)
                .addGroup(albumDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artistText)
                    .addComponent(albumArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(albumDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(albumText)
                    .addComponent(albumTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(albumDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalDurationText)
                    .addComponent(totalDuration))
                .addGap(18, 18, 18)
                .addComponent(albumScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        albumImage.getAccessibleContext().setAccessibleName("albumImage");

        playButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\thegr\\Desktop\\CW2\\MAPPS\\data\\play-button.png")); // NOI18N
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playButtonMouseClicked(evt);
            }
        });

        stopButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\thegr\\Desktop\\CW2\\MAPPS\\data\\stop-button.png")); // NOI18N
        stopButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopButtonMouseClicked(evt);
            }
        });

        pList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                pListValueChanged(evt);
            }
        });
        playlistScroll.setViewportView(pList);

        loadPButton.setText("Load Playlist");
        loadPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadPButtonActionPerformed(evt);
            }
        });

        plNameLabel.setText("Playlist Name:");

        plDurationLabel.setText("Playlist Duration:");

        trackDurationLabel.setText("Track Duration:");

        javax.swing.GroupLayout playlistPanelLayout = new javax.swing.GroupLayout(playlistPanel);
        playlistPanel.setLayout(playlistPanelLayout);
        playlistPanelLayout.setHorizontalGroup(
            playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlistPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playlistScroll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, playlistPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playlistPanelLayout.createSequentialGroup()
                                .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(plNameLabel)
                                    .addComponent(plDurationLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(plDuration)
                                    .addComponent(plName)))
                            .addGroup(playlistPanelLayout.createSequentialGroup()
                                .addComponent(trackDurationLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(trackDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(loadPButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        playlistPanelLayout.setVerticalGroup(
            playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlistPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playlistScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plName)
                    .addComponent(plNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plDuration)
                    .addComponent(plDurationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playlistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(trackDuration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trackDurationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(loadPButton)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout centrePanelLayout = new javax.swing.GroupLayout(centrePanel);
        centrePanel.setLayout(centrePanelLayout);
        centrePanelLayout.setHorizontalGroup(
            centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        centrePanelLayout.setVerticalGroup(
            centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        createPlaylist.setText("File");
        createPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPlaylistActionPerformed(evt);
            }
        });

        createPlaylistMenu.setText("Create new playlist");
        createPlaylistMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPlaylistMenuActionPerformed(evt);
            }
        });
        createPlaylist.add(createPlaylistMenu);

        Menu.add(createPlaylist);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playlistPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(centrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(albumDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(playButton)
                                .addGap(18, 18, 18)
                                .addComponent(stopButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(nowPlaying)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(collectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(centrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playlistPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(albumDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(stopButton)
                            .addComponent(playButton))
                        .addGap(18, 18, 18)
                        .addComponent(nowPlaying))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //This method reacts to a mouse click on the play button
    private void playButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseClicked
        // if the player is already active (and therefore playing a track, close
        if (mp3 != null) {
            mp3.close();
        }
        mp3 = new MP3Player0();
        //Check whether a track was selected from the album tracks
        if (!albumTracks.isSelectionEmpty()) {
            pList.clearSelection();
            String artist = albumArtist.getText();
            String title = albumTracks.getSelectedValue().getTitle().replaceAll(" ", "_") + ".mp3";
            File dir = new File("data/tracks/" + artist + "/");
            FilenameFilter filter = new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    if (name.endsWith(title)) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };

            File[] matches = dir.listFiles(filter);
            String tTitle = albumTracks.getSelectedValue().getTitle();
            nowPlaying.setText("Now Playing: " + artist + " - " + tTitle);
            for (File file : matches) {
                System.out.println("Now playing:" + file);
                mp3.play(file.toString());
            }
            //Check if a track was selected on the playlist
        } else if (!pList.isSelectionEmpty()) {
            String artist = pList.getSelectedValue().getTrackAlbum().getArtist();
            String title = pList.getSelectedValue().getTitle().replaceAll(" ", "_") + ".mp3";
            File dir = new File("data/tracks/" + artist + "/");
            FilenameFilter filter = new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    if (name.endsWith(title)) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };

            File[] matches = dir.listFiles(filter);
            String tTitle = albumTracks.getSelectedValue().getTitle();
            nowPlaying.setText("Now Playing: " + artist + " - " + tTitle);
            for (File file : matches) {
                System.out.println("Now playing:" + file);
                mp3.play(file.toString());
            }

        }
    }//GEN-LAST:event_playButtonMouseClicked

    private void loadCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadCButtonActionPerformed
        if (!collectionModel.isEmpty()) {
            collectionPopup.pack();
            collectionPopup.setLocationRelativeTo(centrePanel);
            collectionPopup.setVisible(true);
        } else {
            JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            File selectedFile;
            int returnValue = jfc.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                selectedFile = jfc.getSelectedFile();
                System.out.println(selectedFile.getAbsolutePath());
                Scanner collectionScanner = null;
                try {
                    collectionScanner = new Scanner(selectedFile);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                loadCollection = new AlbumCollection();
                loadCollection.addAlbums(collectionScanner);
                ArrayList albums = loadCollection.getCollection();
                Collections.sort(albums, Album.AlbumComparator);
                for (int i = 0; i < albums.size(); i++) {
                    collectionModel.addElement(albums.get(i));
                }
            }
        }
    }//GEN-LAST:event_loadCButtonActionPerformed


    private void cListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_cListValueChanged
        if (!evt.getValueIsAdjusting() && !cList.isSelectionEmpty()) {
            albumTracksModel.removeAllElements();
            JList source = (JList) evt.getSource();
            Album selected = (Album) source.getSelectedValue();
            String path = "data/albumimages/" + selected.getArtist().replaceAll("\\s+", "") + "_"
                    + selected.getTitle().replaceAll("\\s+", "").replaceAll("\\?", "") + ".jpg";
            File temp = new File(path);
            boolean exists = temp.exists();
            if (exists) {
                ImageIcon icon = new ImageIcon(path);
                albumImage.setIcon(icon);
            } else {
                ImageIcon icon = new ImageIcon("data/albumimages/noimage.jpg");
                albumImage.setIcon(icon);
            }
            albumTitle.setText(selected.getTitle());
            albumArtist.setText(selected.getArtist());
            totalDuration.setText(selected.getPlayTime().toString());
            for (int i = 0; i < selected.totalTracks(); i++) {
                albumTracksModel.addElement(selected.getTrack(i));
            }
        }
    }//GEN-LAST:event_cListValueChanged

    private void loadPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadPButtonActionPerformed
        if (loadCollection == null) {
            playlistPopup.pack();
            playlistPopup.setLocationRelativeTo(centrePanel);
            playlistPopup.setVisible(true);
        } else {
            JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            if (!playlistModel.isEmpty()) {
                playlistModel.removeAllElements();
            }
            File selectedFile;
            int returnValue = jfc.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                try {
                    selectedFile = jfc.getSelectedFile();
                    System.out.println(selectedFile.getAbsolutePath());
                    Scanner playlistScanner = new Scanner(selectedFile);
                    loadPlaylist = new Playlist(loadCollection);
                    loadPlaylist.addPlaylistTracks(playlistScanner);
                    int count = 0;
                    for (int i = 0; i < loadPlaylist.totalTracks(); i++) {
                        if (collectionModel.contains(loadPlaylist.getPlaylistTrack(i).getTrackAlbum())) {
                            count += 1;
                        }
                    }
                    if (!(count == loadPlaylist.totalTracks())) {
                        playlistWarning.pack();
                        playlistWarning.setLocationRelativeTo(centrePanel);
                        playlistWarning.setVisible(true);
                        loadPlaylist = null;
                    } else {
                        for (int i = 0; i < loadPlaylist.totalTracks(); i++) {
                            playlistModel.addElement(loadPlaylist.getPlaylistTrack(i));
                        }
                        plName.setText(selectedFile.getName().replace(".txt", ""));
                        plDuration.setText(loadPlaylist.totalDuration().toString());
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_loadPButtonActionPerformed

    private void albumTracksValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_albumTracksValueChanged
        //pList.clearSelection();
    }//GEN-LAST:event_albumTracksValueChanged

    private void pListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_pListValueChanged
        if (!evt.getValueIsAdjusting() && !pList.isSelectionEmpty()) {
            trackDuration.setText(pList.getSelectedValue().getDuration().toString());
            albumTracksModel.removeAllElements();
            JList source = (JList) evt.getSource();
            PlaylistTrack ptSelected = (PlaylistTrack) source.getSelectedValue();
            Album playlistAlbum = ptSelected.getTrackAlbum();
            String path = "data/albumimages/" + playlistAlbum.getArtist().replaceAll("\\s+", "") + "_"
                    + playlistAlbum.getTitle().replaceAll("\\s+", "").replaceAll("\\?", "") + ".jpg";
            File temp = new File(path);
            boolean exists = temp.exists();
            if (exists) {
                ImageIcon icon = new ImageIcon(path);
                albumImage.setIcon(icon);
            } else {
                ImageIcon icon = new ImageIcon("data/albumimages/noimage.jpg");
                albumImage.setIcon(icon);
            }
            albumTitle.setText(playlistAlbum.getTitle());
            albumArtist.setText(playlistAlbum.getArtist());
            totalDuration.setText(playlistAlbum.getPlayTime().toString());
            for (int i = 0; i < playlistAlbum.totalTracks(); i++) {
                albumTracksModel.addElement(playlistAlbum.getTrack(i));
            }
        }
    }//GEN-LAST:event_pListValueChanged

    private void stopButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopButtonMouseClicked
        mp3.close();
        nowPlaying.setText("");
    }//GEN-LAST:event_stopButtonMouseClicked

    private void createPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPlaylistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createPlaylistActionPerformed

    private void createPlaylistMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPlaylistMenuActionPerformed
        createNewPlaylistDialog.setLocationRelativeTo(centrePanel);
        createNewPlaylistDialog.pack();
        createNewPlaylistDialog.setVisible(true);
    }//GEN-LAST:event_createPlaylistMenuActionPerformed

    private void chooseAlbumValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_chooseAlbumValueChanged
        if (!evt.getValueIsAdjusting() && !chooseAlbum.isSelectionEmpty()) {
            chooseAlbumTracksModel.removeAllElements();
            JList source = (JList) evt.getSource();
            Album selected = (Album) source.getSelectedValue();
            for (int i = 0; i < selected.totalTracks(); i++) {
                chooseAlbumTracksModel.addElement(selected.getTrack(i));
            }
        } else if (!evt.getValueIsAdjusting() && chooseAlbum.isSelectionEmpty()) {
            chooseAlbumTracksModel.removeAllElements();
        }
    }//GEN-LAST:event_chooseAlbumValueChanged

    private void addAlbumTrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAlbumTrackActionPerformed
        if (!chooseTrack.isSelectionEmpty()) {
            Album ptAlbum = (Album) chooseAlbum.getSelectedValue();
            String songTitle = chooseTrack.getSelectedValue().getTitle();
            PlaylistTrack ptSelected = new PlaylistTrack(songTitle, ptAlbum);
            newPlaylistModel.addElement(ptSelected);
        }
    }//GEN-LAST:event_addAlbumTrackActionPerformed

    private void addPlaylistTrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlaylistTrackActionPerformed
        if (!choosePlaylistTrack.isSelectionEmpty()) {
            newPlaylistModel.addElement(choosePlaylistTrack.getSelectedValue());
        }
    }//GEN-LAST:event_addPlaylistTrackActionPerformed

    private void removeTrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTrackActionPerformed
        if (!selectedTracks.isSelectionEmpty()) {
            newPlaylistModel.remove(selectedTracks.getSelectedIndex());
        }
    }//GEN-LAST:event_removeTrackActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        newPlaylistModel.removeAllElements();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showSaveDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = jfc.getSelectedFile();
            PrintWriter out;
            try {
                out = new PrintWriter(file + ".txt");

                for (int i = 0; i < newPlaylistModel.getSize(); i++) {
                    out.println(newPlaylistModel.getElementAt(i) + "\n");
                }
                out.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        createNewPlaylistDialog.setVisible(false);
        newPlaylistModel.removeAllElements();
        chooseAlbum.clearSelection();
        chooseTrack.clearSelection();
        choosePlaylistTrack.clearSelection();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void closePPopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closePPopupActionPerformed
        playlistPopup.setVisible(false);
    }//GEN-LAST:event_closePPopupActionPerformed

    private void mergeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mergeButtonActionPerformed
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        File selectedFile;
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            selectedFile = jfc.getSelectedFile();
            System.out.println(selectedFile.getAbsolutePath());
            Scanner collectionScanner = null;
            try {
                collectionScanner = new Scanner(selectedFile);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            loadCollection = new AlbumCollection();
            loadCollection.addAlbums(collectionScanner);
            ArrayList albums = loadCollection.getCollection();
            Collections.sort(albums, Album.AlbumComparator);
            for (int i = 0; i < albums.size(); i++) {
                collectionModel.addElement(albums.get(i));
            }
            collectionPopup.setVisible(false);
        }
    }//GEN-LAST:event_mergeButtonActionPerformed

    private void createNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewButtonActionPerformed
        cList.clearSelection();
        pList.clearSelection();
        albumTracks.clearSelection();
        albumTracksModel.removeAllElements();
        if (!playlistModel.isEmpty()) {
            playlistModel.removeAllElements();
        }
        collectionModel.removeAllElements();
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        File selectedFile;
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            selectedFile = jfc.getSelectedFile();
            System.out.println(selectedFile.getAbsolutePath());
            Scanner collectionScanner = null;
            try {
                collectionScanner = new Scanner(selectedFile);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            loadCollection = new AlbumCollection();
            loadCollection.addAlbums(collectionScanner);
            ArrayList albums = loadCollection.getCollection();
            Collections.sort(albums, Album.AlbumComparator);
            for (int i = 0; i < albums.size(); i++) {
                collectionModel.addElement(albums.get(i));
            }
        }
        collectionPopup.setVisible(false);
    }//GEN-LAST:event_createNewButtonActionPerformed

    private void collectionCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collectionCancelActionPerformed
        collectionPopup.setVisible(false);
    }//GEN-LAST:event_collectionCancelActionPerformed

    private void warningOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warningOKActionPerformed
        playlistWarning.setVisible(false);
    }//GEN-LAST:event_warningOKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JButton addAlbumTrack;
    private javax.swing.JButton addPlaylistTrack;
    private javax.swing.JLabel albumArtist;
    private javax.swing.JPanel albumDetails;
    private javax.swing.JLabel albumImage;
    private javax.swing.JScrollPane albumScroll;
    private javax.swing.JScrollPane albumScrollPop;
    private javax.swing.JLabel albumText;
    private javax.swing.JLabel albumTitle;
    private javax.swing.JList<Track> albumTracks;
    private javax.swing.JLabel artistText;
    private javax.swing.JList<Album> cList;
    private javax.swing.JPanel centrePanel;
    private javax.swing.JLabel choicePopLabel;
    private javax.swing.JList<Album> chooseAlbum;
    private javax.swing.JList<PlaylistTrack> choosePlaylistTrack;
    private javax.swing.JList<Track> chooseTrack;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closePPopup;
    private javax.swing.JButton collectionCancel;
    private javax.swing.JPanel collectionPanel;
    private javax.swing.JDialog collectionPopup;
    private javax.swing.JScrollPane collectionScroll;
    private javax.swing.JButton createNewButton;
    private javax.swing.JDialog createNewPlaylistDialog;
    private javax.swing.JMenu createPlaylist;
    private javax.swing.JMenuItem createPlaylistMenu;
    private javax.swing.JButton loadCButton;
    private javax.swing.JButton loadPButton;
    private javax.swing.JButton mergeButton;
    private javax.swing.JPanel newPlaylistPanel;
    private javax.swing.JScrollPane newPlaylistScroll;
    private javax.swing.JLabel nowPlaying;
    private javax.swing.JList<PlaylistTrack> pList;
    private javax.swing.JLabel plDuration;
    private javax.swing.JLabel plDurationLabel;
    private javax.swing.JLabel plName;
    private javax.swing.JLabel plNameLabel;
    private javax.swing.JLabel playButton;
    private javax.swing.JPanel playlistPanel;
    private javax.swing.JLabel playlistPopLabel;
    private javax.swing.JPanel playlistPopPanel;
    private javax.swing.JDialog playlistPopup;
    private javax.swing.JScrollPane playlistScroll;
    private javax.swing.JScrollPane playlistScrollPop;
    private javax.swing.JDialog playlistWarning;
    private javax.swing.JPanel popupCollectionPanel;
    private javax.swing.JButton removeTrack;
    private javax.swing.JButton saveButton;
    private javax.swing.JList<PlaylistTrack> selectedTracks;
    private javax.swing.JLabel stopButton;
    private javax.swing.JLabel totalDuration;
    private javax.swing.JLabel totalDurationText;
    private javax.swing.JLabel trackDuration;
    private javax.swing.JLabel trackDurationLabel;
    private javax.swing.JScrollPane trackScrollPop;
    private javax.swing.JButton warningOK;
    private javax.swing.JLabel warningPT1;
    private javax.swing.JLabel warningPT2;
    // End of variables declaration//GEN-END:variables
}
