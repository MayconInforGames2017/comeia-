import { Router } from "express";
import itemsRouter from "./items.routes";
import locationRouter from "./Location.routes";

const routes = Router();

routes.use('/items', itemsRouter);
routes.use('locations', locationRouter);

export default routes;