import React, {useEffect, useState} from 'react';
import BoardItem from "../../components/BoardItem";



const List = () => {

    const [item, setItem] = useState([]);

    useEffect(() => {
        fetch("/api/board/list")
            .then((response) => {
                return response.json();
            })
            .then(function (data) {
                setItem(data);
            });
    }, []);



    return (
        <div>
            <h1>리스트</h1>
            {item.map((item)=>
                <BoardItem key={item.id} item={item}/>
            )}

        </div>
    );
};

export default List;