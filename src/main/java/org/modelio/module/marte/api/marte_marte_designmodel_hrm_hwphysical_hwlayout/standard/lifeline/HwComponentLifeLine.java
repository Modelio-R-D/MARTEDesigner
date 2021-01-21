/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.lifeline.HwResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwComponent_LifeLine >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("01fd86ed-508c-4d93-b6da-40a3acfdf58e")
public class HwComponentLifeLine extends HwResourceLifeline {
    @objid ("ad5eb643-345d-4748-991c-4f7b82920cd7")
    public static final String STEREOTYPE_NAME = "HwComponent_LifeLine";

    @objid ("9afd0a49-aef5-41d7-b994-4121a32b296d")
    public static final String HWCOMPONENT_LIFELINE_AREA_TAGTYPE = "HwComponent_LifeLine_area";

    @objid ("e22a7dcf-9980-46f0-882e-6677ccac1451")
    public static final String HWCOMPONENT_LIFELINE_DIMENSIONS_TAGTYPE = "HwComponent_LifeLine_dimensions";

    @objid ("521ab53b-0228-4151-b76f-241bc74b2a6e")
    public static final String HWCOMPONENT_LIFELINE_GRID_TAGTYPE = "HwComponent_LifeLine_grid";

    @objid ("c948b0f5-691f-4de0-9f75-f7ea2a49647a")
    public static final String HWCOMPONENT_LIFELINE_KIND_TAGTYPE = "HwComponent_LifeLine_kind";

    @objid ("a6b687f4-425c-4ba0-a7bc-be9eec7fd2f6")
    public static final String HWCOMPONENT_LIFELINE_NBPINS_TAGTYPE = "HwComponent_LifeLine_nbPins";

    @objid ("f83dc194-adc8-4027-be9a-2df4e091990b")
    public static final String HWCOMPONENT_LIFELINE_POSITION_TAGTYPE = "HwComponent_LifeLine_position";

    @objid ("11bb2b21-15cf-441c-8ab4-59c23995c43c")
    public static final String HWCOMPONENT_LIFELINE_POWEREDSERVICES_TAGTYPE = "HwComponent_LifeLine_poweredServices";

    @objid ("cc899c36-94aa-452c-885d-cbc395a45e32")
    public static final String HWCOMPONENT_LIFELINE_PRICE_TAGTYPE = "HwComponent_LifeLine_price";

    @objid ("8e92741e-50ae-4fc5-8575-7ee64f451ef2")
    public static final String HWCOMPONENT_LIFELINE_R_CONDITIONS_TAGTYPE = "HwComponent_LifeLine_r_Conditions";

    @objid ("d5642c14-b27d-4e58-ab3c-e44f60bc5814")
    public static final String HWCOMPONENT_LIFELINE_STATICCONSUMPTION_TAGTYPE = "HwComponent_LifeLine_staticConsumption";

    @objid ("eb68db78-d877-4f35-be4e-586286f30749")
    public static final String HWCOMPONENT_LIFELINE_STATICDISSIPATION_TAGTYPE = "HwComponent_LifeLine_staticDissipation";

    @objid ("8809ef24-3eaf-4ee3-ac20-0a775d6bb66e")
    public static final String HWCOMPONENT_LIFELINE_SUBCOMPONENTS_TAGTYPE = "HwComponent_LifeLine_subComponents";

    @objid ("a3e749f3-31b8-4cdf-ac3d-784b9c5d7d8a")
    public static final String HWCOMPONENT_LIFELINE_WEIGHT_TAGTYPE = "HwComponent_LifeLine_weight";

    /**
     * Tells whether a {@link HwComponentLifeLine proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwComponent_LifeLine >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("aa1e2de5-7a1e-4751-ae2a-819cb6937c63")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentLifeLine.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwComponent_LifeLine >> then instantiate a {@link HwComponentLifeLine} proxy.
     * 
     * @return a {@link HwComponentLifeLine} proxy on the created {@link Lifeline}.
     */
    @objid ("8c6b0ff7-5b0f-4a62-bc12-715d7176f812")
    public static HwComponentLifeLine create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentLifeLine.STEREOTYPE_NAME);
        return HwComponentLifeLine.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwComponentLifeLine} proxy from a {@link Lifeline} stereotyped << HwComponent_LifeLine >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwComponentLifeLine} proxy or <i>null</i>.
     */
    @objid ("6e1ad78c-ed7d-4e1a-9655-e01941364e42")
    public static HwComponentLifeLine instantiate(final Lifeline obj) {
        return HwComponentLifeLine.canInstantiate(obj) ? new HwComponentLifeLine(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComponentLifeLine} proxy from a {@link Lifeline} stereotyped << HwComponent_LifeLine >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwComponentLifeLine} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dfdc28fc-70f3-4495-9171-4996faba47ac")
    public static HwComponentLifeLine safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwComponentLifeLine.canInstantiate(obj))
        	return new HwComponentLifeLine(obj);
        else
        	throw new IllegalArgumentException("HwComponentLifeLine: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b892e6c0-d321-4a60-841e-7433d4461f07")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        HwComponentLifeLine other = (HwComponentLifeLine) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("dfb5bcaa-0966-4eb0-88d8-e809bdc13d51")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1befd3e5-3c4e-42e7-8ccc-56909b884269")
    public String getHwComponent_LifeLine_area() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_AREA_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_LifeLine_dimensions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c2d05169-f9c0-4b4c-a1cf-8301a8b43856")
    public List<String> getHwComponent_LifeLine_dimensions() {
        return this.elt.getTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_DIMENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_LifeLine_grid'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ccf863f5-cdfd-4f38-b0d3-6b6760b8a752")
    public List<String> getHwComponent_LifeLine_grid() {
        return this.elt.getTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_GRID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("49171ed2-3548-4bbd-9a5a-19e3693d1517")
    public String getHwComponent_LifeLine_kind() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ce78debd-68e9-4561-8e93-c2679f6b0f75")
    public String getHwComponent_LifeLine_nbPins() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_NBPINS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_LifeLine_position'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6b31c377-9966-4856-a8dc-40bacc5b1590")
    public List<String> getHwComponent_LifeLine_position() {
        return this.elt.getTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_POSITION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_LifeLine_poweredServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6afdb9ef-7234-412f-8c5a-02969f7546a1")
    public List<String> getHwComponent_LifeLine_poweredServices() {
        return this.elt.getTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_POWEREDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("057a7d25-b5b6-42e2-9c1f-a09021d048dd")
    public String getHwComponent_LifeLine_price() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_PRICE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_LifeLine_r_Conditions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("90502fdd-2be3-4984-ba31-b780726d0b44")
    public List<String> getHwComponent_LifeLine_r_Conditions() {
        return this.elt.getTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_R_CONDITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("526d36ec-83a7-404c-8915-2913d717e58b")
    public String getHwComponent_LifeLine_staticConsumption() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_STATICCONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3e3d49a2-76b8-4774-b116-34211b09acb7")
    public String getHwComponent_LifeLine_staticDissipation() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_STATICDISSIPATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_LifeLine_subComponents'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("741ba1a6-fe1e-4963-9246-d8639a5ab823")
    public List<String> getHwComponent_LifeLine_subComponents() {
        return this.elt.getTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_SUBCOMPONENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ec93c33b-4b19-458a-ae1e-bead2ae46e09")
    public String getHwComponent_LifeLine_weight() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_WEIGHT_TAGTYPE_ELT);
    }

    @objid ("48a4ad1e-0290-4d1e-8c33-1578f2b56fe2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("46c857b6-756c-4d4d-ac2d-ed0ea5c9510c")
    public void setHwComponent_LifeLine_area(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_AREA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_LifeLine_dimensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("df5dd7a0-4751-4efd-b102-bff142ba7b6a")
    public void setHwComponent_LifeLine_dimensions(final List<String> values) {
        this.elt.putTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_DIMENSIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_LifeLine_grid'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9cc37fc2-54b8-4f74-a4d3-3d14dc1cd5d7")
    public void setHwComponent_LifeLine_grid(final List<String> values) {
        this.elt.putTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_GRID_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("58510885-8eef-4bd3-9901-c967b779de9d")
    public void setHwComponent_LifeLine_kind(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("56974642-5a50-4cc6-ad30-03b5791dda35")
    public void setHwComponent_LifeLine_nbPins(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_NBPINS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_LifeLine_position'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f7e486bc-9798-4219-b17a-c3663d4f6367")
    public void setHwComponent_LifeLine_position(final List<String> values) {
        this.elt.putTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_POSITION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_LifeLine_poweredServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("46f4c125-e639-43b6-bdb3-dd4861ca5163")
    public void setHwComponent_LifeLine_poweredServices(final List<String> values) {
        this.elt.putTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_POWEREDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f2253a17-df3c-4c44-bbcb-745fbea5a480")
    public void setHwComponent_LifeLine_price(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_PRICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_LifeLine_r_Conditions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2219052e-c0ba-44c9-98be-478a7334fca5")
    public void setHwComponent_LifeLine_r_Conditions(final List<String> values) {
        this.elt.putTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_R_CONDITIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("400f611b-b3f3-4fe2-8b94-85ce22d8d047")
    public void setHwComponent_LifeLine_staticConsumption(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_STATICCONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c44c2cfa-0222-41d1-b2fe-56cfcf7d7a5d")
    public void setHwComponent_LifeLine_staticDissipation(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_STATICDISSIPATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_LifeLine_subComponents'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("15ce869e-0c78-4dfe-8ee0-f742392403fb")
    public void setHwComponent_LifeLine_subComponents(final List<String> values) {
        this.elt.putTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_SUBCOMPONENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7bcc31fb-e326-45ae-9d59-ac7e06cdb315")
    public void setHwComponent_LifeLine_weight(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_WEIGHT_TAGTYPE_ELT, value);
    }

    @objid ("52e5d5f2-4ab6-49f4-85cd-c51cc49b099d")
    protected HwComponentLifeLine(final Lifeline elt) {
        super(elt);
    }

    @objid ("73e423b9-926a-4346-89f8-4bce8cbeb68a")
    public static final class MdaTypes {
        @objid ("f027ddfb-9cf9-4337-b732-fe5fbe3d87e5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6b75c448-b9e3-4e09-856f-b07a87a2b220")
        public static TagType HWCOMPONENT_LIFELINE_KIND_TAGTYPE_ELT;

        @objid ("19d85fe3-e2cc-4014-8f51-2c8d4879b6f0")
        public static TagType HWCOMPONENT_LIFELINE_DIMENSIONS_TAGTYPE_ELT;

        @objid ("3ec59f73-e8f4-496a-8183-21f87d4ab214")
        public static TagType HWCOMPONENT_LIFELINE_AREA_TAGTYPE_ELT;

        @objid ("ff83ac79-d57e-4f47-a378-abf7ca5ad6ae")
        public static TagType HWCOMPONENT_LIFELINE_POSITION_TAGTYPE_ELT;

        @objid ("8ee836ae-d4d4-4463-aa23-a2565366f063")
        public static TagType HWCOMPONENT_LIFELINE_GRID_TAGTYPE_ELT;

        @objid ("09ac32d1-cdfe-4480-9d7f-659e8c4e0ae2")
        public static TagType HWCOMPONENT_LIFELINE_NBPINS_TAGTYPE_ELT;

        @objid ("52da59f7-c5f1-4623-8819-0128921d1229")
        public static TagType HWCOMPONENT_LIFELINE_WEIGHT_TAGTYPE_ELT;

        @objid ("9d723ca2-7b2d-462b-a926-33bb5dd81aa7")
        public static TagType HWCOMPONENT_LIFELINE_PRICE_TAGTYPE_ELT;

        @objid ("8d7f3686-80a6-4608-875c-70ba205a5c7c")
        public static TagType HWCOMPONENT_LIFELINE_R_CONDITIONS_TAGTYPE_ELT;

        @objid ("584196f0-175f-45c7-95cf-49486ee01682")
        public static TagType HWCOMPONENT_LIFELINE_POWEREDSERVICES_TAGTYPE_ELT;

        @objid ("a5202d36-6a54-4155-96d6-511d9626306b")
        public static TagType HWCOMPONENT_LIFELINE_STATICCONSUMPTION_TAGTYPE_ELT;

        @objid ("f522146c-25ea-4b0f-bc11-7758553e9364")
        public static TagType HWCOMPONENT_LIFELINE_STATICDISSIPATION_TAGTYPE_ELT;

        @objid ("4846e97c-72b1-4f1d-8d01-a97eb8baf45f")
        public static TagType HWCOMPONENT_LIFELINE_SUBCOMPONENTS_TAGTYPE_ELT;

        @objid ("ccb616d2-42d8-4f13-868a-72b4ebbc90c9")
        private static Stereotype MDAASSOCDEP;

        @objid ("94b6ca4f-36f9-4da8-9cae-858098af6740")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("170ca1a9-73ac-4637-9aef-e46541e3e84a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "76bd8842-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd8847-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_DIMENSIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd8843-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_AREA_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd8848-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_POSITION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd8849-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_GRID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd8844-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_NBPINS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd8845-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_WEIGHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd8846-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_PRICE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd884a-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_R_CONDITIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd884b-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_POWEREDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd884c-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_STATICCONSUMPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd884d-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_STATICDISSIPATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd884e-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_SUBCOMPONENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd884f-10b4-11df-81d9-0014222a9f79");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
