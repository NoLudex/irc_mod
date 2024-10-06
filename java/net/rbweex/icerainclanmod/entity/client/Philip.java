package net.rbweex.icerainclanmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class Philip<T extends Entity> extends EntityModel<T> {
	private final ModelPart All;
	private final ModelPart Head_all;
	private final ModelPart gloza;
	private final ModelPart zrachok;
	private final ModelPart hair;
	private final ModelPart svetiyska;
	private final ModelPart left_ears;
	private final ModelPart right_ears;
	private final ModelPart body1;
	private final ModelPart tail_all;
	private final ModelPart one;
	private final ModelPart two;
	private final ModelPart three;
	private final ModelPart four;
	private final ModelPart five;
	private final ModelPart tail_slim;
	private final ModelPart left_hand_all;
	private final ModelPart ln_top;
	private final ModelPart ln_bottom;
	private final ModelPart right_hand_all;
	private final ModelPart rh_top;
	private final ModelPart rh_bottom;
	private final ModelPart ln_bottom2;
	private final ModelPart ln_bottom3;
	private final ModelPart right_leg_all;
	private final ModelPart rl_top;
	private final ModelPart rl_bottom;
	private final ModelPart left_leg_all;
	private final ModelPart ll_top;
	private final ModelPart ll_bottom;

	public Philip(ModelPart root) {
		this.All = root.getChild("All");
		this.Head_all = root.getChild("Head_all");
		this.gloza = root.getChild("gloza");
		this.zrachok = root.getChild("zrachok");
		this.hair = root.getChild("hair");
		this.svetiyska = root.getChild("svetiyska");
		this.left_ears = root.getChild("left_ears");
		this.right_ears = root.getChild("right_ears");
		this.body1 = root.getChild("body1");
		this.tail_all = root.getChild("tail_all");
		this.one = root.getChild("one");
		this.two = root.getChild("two");
		this.three = root.getChild("three");
		this.four = root.getChild("four");
		this.five = root.getChild("five");
		this.tail_slim = root.getChild("tail_slim");
		this.left_hand_all = root.getChild("left_hand_all");
		this.ln_top = root.getChild("ln_top");
		this.ln_bottom = root.getChild("ln_bottom");
		this.right_hand_all = root.getChild("right_hand_all");
		this.rh_top = root.getChild("rh_top");
		this.rh_bottom = root.getChild("rh_bottom");
		this.ln_bottom2 = root.getChild("ln_bottom2");
		this.ln_bottom3 = root.getChild("ln_bottom3");
		this.right_leg_all = root.getChild("right_leg_all");
		this.rl_top = root.getChild("rl_top");
		this.rl_bottom = root.getChild("rl_bottom");
		this.left_leg_all = root.getChild("left_leg_all");
		this.ll_top = root.getChild("ll_top");
		this.ll_bottom = root.getChild("ll_bottom");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition All = partdefinition.addOrReplaceChild("All", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition Head_all = All.addOrReplaceChild("Head_all", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -12.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gloza = Head_all.addOrReplaceChild("gloza", CubeListBuilder.create().texOffs(2, 2).addBox(-3.0F, -8.0F, -4.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(3, 2).mirror().addBox(1.0F, -8.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition zrachok = gloza.addOrReplaceChild("zrachok", CubeListBuilder.create().texOffs(3, 2).addBox(-2.0F, -8.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(2, 2).mirror().addBox(1.0F, -8.0F, -4.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hair = Head_all.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(24, 8).addBox(-4.0F, -13.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(35, 0).addBox(-4.0F, -14.0F, -5.0F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(6, 0).addBox(-5.0F, -13.0F, -5.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(4.0F, -13.0F, -5.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(-1.0F, -11.0F, -5.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(10, 36).addBox(0.0F, -8.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(22, 34).addBox(1.0F, -11.0F, -5.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(40, 7).addBox(2.0F, -9.0F, -5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(4.0F, -13.0F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(24, 24).addBox(5.0F, -9.0F, -5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 20).addBox(4.0F, -5.0F, -4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(29, 60).addBox(-4.0F, -13.0F, 4.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 31).addBox(-1.0F, -14.0F, 5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 36).addBox(-3.0F, -15.0F, 6.0F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(48, 13).addBox(-1.0F, -7.0F, 6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(45, 17).addBox(-1.0F, -7.0F, 8.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(66, 27).addBox(-2.0F, -14.0F, 10.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(43, 27).addBox(-1.0F, -12.0F, 10.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(26, 48).addBox(-1.0F, -14.0F, 11.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 48).addBox(-1.0F, -15.0F, 10.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 50).addBox(-1.0F, -14.0F, 12.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 36).addBox(-2.0F, -16.0F, 7.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 4).addBox(-1.0F, -17.0F, 8.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(-5.0F, -5.0F, -4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 20).addBox(-5.0F, -13.0F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition svetiyska = Head_all.addOrReplaceChild("svetiyska", CubeListBuilder.create().texOffs(6, 3).addBox(0.0F, -14.0F, -4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 22).addBox(0.0F, -15.0F, -6.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(20, 14).addBox(0.0F, -16.0F, -8.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(26, 24).addBox(0.0F, -15.0F, -9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 3).addBox(0.0F, -14.0F, -10.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(23, 7).addBox(-4.0F, -14.0F, -5.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(33, 27).addBox(-3.0F, -14.0F, -4.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -12.0F, -11.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_ears = Head_all.addOrReplaceChild("left_ears", CubeListBuilder.create().texOffs(66, 47).addBox(-3.0F, -3.0F, -1.0F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(10, 39).addBox(-1.0F, -3.0F, -1.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 40).addBox(0.0F, -3.0F, -1.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -7.0F, 1.0F, 0.0F, -0.9599F, 0.0F));

		PartDefinition right_ears = Head_all.addOrReplaceChild("right_ears", CubeListBuilder.create().texOffs(51, 66).addBox(-2.0F, -3.0F, -1.0F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(24, 26).addBox(-3.0F, -3.0F, -1.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 7).addBox(-4.0F, -3.0F, -1.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -7.0F, 1.0F, 0.0F, 0.9599F, 0.0F));

		PartDefinition body1 = All.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(2, 1).addBox(0.0F, -6.0F, 2.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 1).addBox(0.0F, -5.0F, 3.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 1).addBox(0.0F, -4.0F, 4.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 1).addBox(0.0F, -3.0F, 5.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 1).addBox(0.0F, -2.0F, 6.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition body_r1 = body1.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -8.0F, -2.0F, 8.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 3.1416F));

		PartDefinition tail_all = All.addOrReplaceChild("tail_all", CubeListBuilder.create(), PartPose.offset(4.0F, -7.0F, 1.0F));

		PartDefinition one = tail_all.addOrReplaceChild("one", CubeListBuilder.create().texOffs(11, 61).addBox(-2.0F, -4.0F, -1.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(61, 10).addBox(-2.0F, -4.0F, 2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-2.0F, -4.0F, 5.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(-2.0F, -4.0F, 11.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 50).addBox(-2.0F, -4.0F, 8.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 18.0F, 2.0F));

		PartDefinition two = tail_all.addOrReplaceChild("two", CubeListBuilder.create().texOffs(64, 0).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(63, 63).addBox(-2.0F, -3.0F, 2.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(63, 51).addBox(-2.0F, -3.0F, 5.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 18.0F, 17.0F));

		PartDefinition three = tail_all.addOrReplaceChild("three", CubeListBuilder.create().texOffs(66, 22).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 65).addBox(-2.0F, -2.0F, 2.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(62, 17).addBox(-2.0F, -2.0F, 5.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 18.0F, 26.0F));

		PartDefinition four = tail_all.addOrReplaceChild("four", CubeListBuilder.create().texOffs(44, 66).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(22, 66).addBox(-1.0F, -2.0F, 5.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(66, 42).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 18.0F, 35.0F));

		PartDefinition five = tail_all.addOrReplaceChild("five", CubeListBuilder.create().texOffs(53, 14).addBox(-1.0F, -1.0F, 2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(38, 3).addBox(-1.0F, -1.0F, 5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(64, 6).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 18.0F, 44.0F));

		PartDefinition tail_slim = tail_all.addOrReplaceChild("tail_slim", CubeListBuilder.create().texOffs(10, 29).addBox(0.0F, -5.0F, 3.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(34, 16).addBox(0.0F, -4.0F, 2.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(34, 17).addBox(0.0F, -3.0F, 1.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(34, 11).addBox(0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(20, 7).addBox(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(20, 4).addBox(0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(20, 6).addBox(0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(34, 10).addBox(0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(34, 15).addBox(0.0F, 3.0F, 1.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(34, 14).addBox(0.0F, 4.0F, 2.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(10, 28).addBox(0.0F, 5.0F, 3.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 17.0F, 50.0F));

		PartDefinition left_hand_all = All.addOrReplaceChild("left_hand_all", CubeListBuilder.create(), PartPose.offset(8.0F, 3.0F, 0.0F));

		PartDefinition ln_top = left_hand_all.addOrReplaceChild("ln_top", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_hand_top_r1 = ln_top.addOrReplaceChild("left_hand_top_r1", CubeListBuilder.create().texOffs(50, 42).addBox(-4.0F, -7.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition ln_bottom = left_hand_all.addOrReplaceChild("ln_bottom", CubeListBuilder.create().texOffs(24, 18).addBox(-2.0F, 6.0F, 2.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(34, 35).addBox(-2.0F, 5.0F, 4.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(6, 33).addBox(-2.0F, 4.0F, 5.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition left_hand_bottom_r1 = ln_bottom.addOrReplaceChild("left_hand_bottom_r1", CubeListBuilder.create().texOffs(50, 18).addBox(-4.0F, -8.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition right_hand_all = All.addOrReplaceChild("right_hand_all", CubeListBuilder.create(), PartPose.offset(-8.0F, 3.0F, 0.0F));

		PartDefinition rh_top = right_hand_all.addOrReplaceChild("rh_top", CubeListBuilder.create(), PartPose.offset(4.0F, -6.0F, 0.0F));

		PartDefinition right_hand_top_r1 = rh_top.addOrReplaceChild("right_hand_top_r1", CubeListBuilder.create().texOffs(50, 54).addBox(-4.0F, -7.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition rh_bottom = right_hand_all.addOrReplaceChild("rh_bottom", CubeListBuilder.create().texOffs(36, 35).addBox(2.0F, 4.0F, 5.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition right_hand_bottom_r1 = rh_bottom.addOrReplaceChild("right_hand_bottom_r1", CubeListBuilder.create().texOffs(54, 30).addBox(-4.0F, -8.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 6.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition ln_bottom2 = right_hand_all.addOrReplaceChild("ln_bottom2", CubeListBuilder.create().texOffs(0, 14).addBox(2.0F, 6.0F, 2.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition ln_bottom3 = right_hand_all.addOrReplaceChild("ln_bottom3", CubeListBuilder.create().texOffs(4, 33).addBox(2.0F, 5.0F, 4.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition right_leg_all = All.addOrReplaceChild("right_leg_all", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition rl_top = right_leg_all.addOrReplaceChild("rl_top", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition right_leg_top_r1 = rl_top.addOrReplaceChild("right_leg_top_r1", CubeListBuilder.create().texOffs(48, 0).addBox(-4.0F, -6.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition rl_bottom = right_leg_all.addOrReplaceChild("rl_bottom", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition right_leg_bottom_r1 = rl_bottom.addOrReplaceChild("right_leg_bottom_r1", CubeListBuilder.create().texOffs(38, 32).addBox(-4.0F, -7.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition left_leg_all = All.addOrReplaceChild("left_leg_all", CubeListBuilder.create(), PartPose.offset(4.0F, 16.0F, 0.0F));

		PartDefinition ll_top = left_leg_all.addOrReplaceChild("ll_top", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition left_leg_top_r1 = ll_top.addOrReplaceChild("left_leg_top_r1", CubeListBuilder.create().texOffs(14, 48).addBox(-4.0F, -6.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition ll_bottom = left_leg_all.addOrReplaceChild("ll_bottom", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition left_leg_bottom_r1 = ll_bottom.addOrReplaceChild("left_leg_bottom_r1", CubeListBuilder.create().texOffs(34, 46).addBox(-4.0F, -7.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		All.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}