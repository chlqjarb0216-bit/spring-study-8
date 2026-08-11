package com.app.service.room;

import java.util.List;

import com.app.dto.room.Info;
import com.app.dto.room.Post;
import com.app.dto.room.Room;

public interface RoomService {
	List<Room> findRoomList();

	Room findRoom(String id);

	Info getServiceInfo();

	List<Post> findPostList();
}
