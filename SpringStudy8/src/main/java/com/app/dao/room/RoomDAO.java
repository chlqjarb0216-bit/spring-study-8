package com.app.dao.room;

import java.util.List;

import com.app.dto.room.Info;
import com.app.dto.room.Post;
import com.app.dto.room.Room;
import com.app.dto.room.RoomSearchCondition;
import com.app.dto.user.User;

public interface RoomDAO {
	List<Room> findRoomList();

	List<User> findRoomListBySearchCondition(RoomSearchCondition roomSearchCondition);

	int saveRoom(Room room);

	Room findRoomByRoomId(int roomId);

	int removeRoom(int roomId);

	int modifyRoom(Room room);

	Info getServiceInfo();

	List<Post> findPostList();
}
