import React, {useEffect, useState} from 'react';
import {useParams} from "react-router-dom";

const View = () => {

	let {id} = useParams();
	
	const [item, setItem] = useState([]);

	useEffect(() => {
		fetch("/api/board/view/" + id)
			.then((response) => {
				return response.json();
			})
			.then(function (data) {
				setItem(data);
			});
	}, []);


	return (
		<div>
			<h1>상세보기</h1>
            <p>
				<strong>번호 {item.id}</strong>
                <strong>제목 {item.title}</strong>
            </p>
		</div>
	);
};

export default View;