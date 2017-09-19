package dhcc.cn.com.fix_phone.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table GROUP_MEMBER.
*/
public class GroupMemberDao extends AbstractDao<GroupMember, Void> {

    public static final String TABLENAME = "GROUP_MEMBER";

    /**
     * Properties of entity GroupMember.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property GroupId = new Property(0, String.class, "groupId", false, "GROUP_ID");
        public final static Property UserId = new Property(1, String.class, "userId", false, "USER_ID");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property PortraitUri = new Property(3, String.class, "portraitUri", false, "PORTRAIT_URI");
        public final static Property DisplayName = new Property(4, String.class, "displayName", false, "DISPLAY_NAME");
        public final static Property NameSpelling = new Property(5, String.class, "nameSpelling", false, "NAME_SPELLING");
        public final static Property DisplayNameSpelling = new Property(6, String.class, "displayNameSpelling", false, "DISPLAY_NAME_SPELLING");
        public final static Property GroupName = new Property(7, String.class, "groupName", false, "GROUP_NAME");
        public final static Property GroupNameSpelling = new Property(8, String.class, "groupNameSpelling", false, "GROUP_NAME_SPELLING");
        public final static Property GroupPortraitUri = new Property(9, String.class, "groupPortraitUri", false, "GROUP_PORTRAIT_URI");
    }


    public GroupMemberDao(DaoConfig config) {
        super(config);
    }

    public GroupMemberDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "'GROUP_MEMBER' (" + //
                   "'GROUP_ID' TEXT NOT NULL ," + // 0: groupId
                   "'USER_ID' TEXT NOT NULL ," + // 1: userId
                   "'NAME' TEXT," + // 2: name
                   "'PORTRAIT_URI' TEXT," + // 3: portraitUri
                   "'DISPLAY_NAME' TEXT," + // 4: displayName
                   "'NAME_SPELLING' TEXT," + // 5: nameSpelling
                   "'DISPLAY_NAME_SPELLING' TEXT," + // 6: displayNameSpelling
                   "'GROUP_NAME' TEXT," + // 7: groupName
                   "'GROUP_NAME_SPELLING' TEXT," + // 8: groupNameSpelling
                   "'GROUP_PORTRAIT_URI' TEXT);"); // 9: groupPortraitUri
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_GROUP_MEMBER_NAME_DISPLAY_NAME_NAME_SPELLING_DISPLAY_NAME_SPELLING_GROUP_NAME_GROUP_NAME_SPELLING ON GROUP_MEMBER" +
                   " (NAME,DISPLAY_NAME,NAME_SPELLING,DISPLAY_NAME_SPELLING,GROUP_NAME,GROUP_NAME_SPELLING);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'GROUP_MEMBER'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, GroupMember entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.getGroupId());
        stmt.bindString(2, entity.getUserId());

        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }

        Uri portraitUri = entity.getPortraitUri();
        if (portraitUri != null) {
            stmt.bindString(4, portraitUri.toString());
        }

        String displayName = entity.getDisplayName();
        if (displayName != null) {
            stmt.bindString(5, displayName);
        }

        String nameSpelling = entity.getNameSpelling();
        if (nameSpelling != null) {
            stmt.bindString(6, nameSpelling);
        }

        String displayNameSpelling = entity.getDisplayNameSpelling();
        if (displayNameSpelling != null) {
            stmt.bindString(7, displayNameSpelling);
        }

        String groupName = entity.getGroupName();
        if (groupName != null) {
            stmt.bindString(8, groupName);
        }

        String groupNameSpelling = entity.getGroupNameSpelling();
        if (groupNameSpelling != null) {
            stmt.bindString(9, groupNameSpelling);
        }

        String groupPortraitUri = entity.getGroupPortraitUri();
        if (groupPortraitUri != null) {
            stmt.bindString(10, groupPortraitUri);
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }

    /** @inheritdoc */
    @Override
    public GroupMember readEntity(Cursor cursor, int offset) {
        GroupMember entity = new GroupMember( //
            cursor.getString(offset + 0), // groupId
            cursor.getString(offset + 1), // userId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : Uri.parse(cursor.getString(offset + 3)), // portraitUri
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // displayName
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // nameSpelling
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // displayNameSpelling
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // groupName
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // groupNameSpelling
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // groupPortraitUri
        );
        return entity;
    }

    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, GroupMember entity, int offset) {
        entity.setGroupId(cursor.getString(offset + 0));
        entity.setUserId(cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPortraitUri(cursor.isNull(offset + 3) ? null : Uri.parse(cursor.getString(offset + 3)));
        entity.setDisplayName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setNameSpelling(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setDisplayNameSpelling(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setGroupName(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setGroupNameSpelling(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setGroupPortraitUri(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
    }

    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(GroupMember entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }

    /** @inheritdoc */
    @Override
    public Void getKey(GroupMember entity) {
        return null;
    }

    /** @inheritdoc */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

}
