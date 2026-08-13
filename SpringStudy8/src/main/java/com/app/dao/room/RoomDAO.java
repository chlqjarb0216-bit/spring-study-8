package com.app.dao.room;

import java.util.List;

import com.app.dto.room.Info;
import com.app.dto.room.Post;
import com.app.dto.room.Room;

public interface RoomDAO {
	List<Room> findRoomList();

	int saveRoom(Room room);

	Room findRoomByRoomId(int roomId);

	Info getServiceInfo();

	List<Post> findPostList();
}
