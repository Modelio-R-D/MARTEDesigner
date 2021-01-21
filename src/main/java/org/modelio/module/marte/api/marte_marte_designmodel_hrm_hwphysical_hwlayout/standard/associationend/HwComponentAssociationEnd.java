/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.associationend.HwResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwComponent_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c84ead3a-e3e3-4950-94cf-c1400fb6a557")
public class HwComponentAssociationEnd extends HwResourceAssociationEnd {
    @objid ("0103f2bb-845e-4faf-8d29-88f1933dda7e")
    public static final String STEREOTYPE_NAME = "HwComponent_AssociationEnd";

    @objid ("c91286e9-5f60-4d5b-8aff-593030b82306")
    public static final String HWCOMPONENT_ASSOCIATIONEND_AREA_TAGTYPE = "HwComponent_AssociationEnd_area";

    @objid ("ea745c9a-e3e3-4e99-89ce-062b79e4f037")
    public static final String HWCOMPONENT_ASSOCIATIONEND_DIMENSIONS_TAGTYPE = "HwComponent_AssociationEnd_dimensions";

    @objid ("9fd67c84-7a58-44c5-9098-f1fecbb8d658")
    public static final String HWCOMPONENT_ASSOCIATIONEND_GRID_TAGTYPE = "HwComponent_AssociationEnd_grid";

    @objid ("b351ac30-f15d-49d6-9966-ab646e5fee2e")
    public static final String HWCOMPONENT_ASSOCIATIONEND_KIND_TAGTYPE = "HwComponent_AssociationEnd_kind";

    @objid ("06fcf0ff-0c23-4440-8686-b820c9f9d6fa")
    public static final String HWCOMPONENT_ASSOCIATIONEND_NBPINS_TAGTYPE = "HwComponent_AssociationEnd_nbPins";

    @objid ("63a7ae00-1fa1-44ec-b018-e8e43cf930f3")
    public static final String HWCOMPONENT_ASSOCIATIONEND_POSITION_TAGTYPE = "HwComponent_AssociationEnd_position";

    @objid ("3cc3557c-6778-4f1c-a4f7-1de7e7a86b86")
    public static final String HWCOMPONENT_ASSOCIATIONEND_POWEREDSERVICES_TAGTYPE = "HwComponent_AssociationEnd_poweredServices";

    @objid ("878355b8-8c86-4b3e-a2df-01dab7e1d8e0")
    public static final String HWCOMPONENT_ASSOCIATIONEND_PRICE_TAGTYPE = "HwComponent_AssociationEnd_price";

    @objid ("c863e6b1-4074-47bb-a2ca-8a26b2b998d3")
    public static final String HWCOMPONENT_ASSOCIATIONEND_R_CONDITIONS_TAGTYPE = "HwComponent_AssociationEnd_r_Conditions";

    @objid ("7f3d4841-4786-4bc3-86ab-464cb9ffa90c")
    public static final String HWCOMPONENT_ASSOCIATIONEND_STATICCONSUMPTION_TAGTYPE = "HwComponent_AssociationEnd_staticConsumption";

    @objid ("5abc3dc9-1e8a-4a06-a121-1b09cb38b913")
    public static final String HWCOMPONENT_ASSOCIATIONEND_STATICDISSIPATION_TAGTYPE = "HwComponent_AssociationEnd_staticDissipation";

    @objid ("08014d66-e328-46f9-af14-8286de0d76cd")
    public static final String HWCOMPONENT_ASSOCIATIONEND_SUBCOMPONENTS_TAGTYPE = "HwComponent_AssociationEnd_subComponents";

    @objid ("05734152-b48e-471b-9c65-d15812a7d3ef")
    public static final String HWCOMPONENT_ASSOCIATIONEND_WEIGHT_TAGTYPE = "HwComponent_AssociationEnd_weight";

    /**
     * Tells whether a {@link HwComponentAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwComponent_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c867c8ff-1236-4d6c-8612-9ad3497038ea")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwComponent_AssociationEnd >> then instantiate a {@link HwComponentAssociationEnd} proxy.
     * 
     * @return a {@link HwComponentAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("fea47672-03b2-4d99-aaa6-f4b0ef167dad")
    public static HwComponentAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentAssociationEnd.STEREOTYPE_NAME);
        return HwComponentAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwComponentAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwComponent_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwComponentAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("64653a0a-4020-4bc9-8516-14aa54ac0e54")
    public static HwComponentAssociationEnd instantiate(final AssociationEnd obj) {
        return HwComponentAssociationEnd.canInstantiate(obj) ? new HwComponentAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComponentAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwComponent_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwComponentAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f934b4c0-94b6-4e94-aadc-66d1484127dd")
    public static HwComponentAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwComponentAssociationEnd.canInstantiate(obj))
        	return new HwComponentAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwComponentAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5cb53c4f-051e-4876-8506-2119545ef427")
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
        HwComponentAssociationEnd other = (HwComponentAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("c2c0aceb-9fc0-4156-b612-9cd6694cdeee")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwComponent_AssociationEnd_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("33dc45b8-a9b6-4452-9e86-ed465e9bbeef")
    public String getHwComponent_AssociationEnd_area() {
        return this.elt.getTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_AREA_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_AssociationEnd_dimensions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("41a2ba21-b096-42c4-b131-c0450644c2b5")
    public List<String> getHwComponent_AssociationEnd_dimensions() {
        return this.elt.getTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_DIMENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_AssociationEnd_grid'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b5630bdd-e09a-47dd-809f-5bd134884278")
    public List<String> getHwComponent_AssociationEnd_grid() {
        return this.elt.getTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_GRID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_AssociationEnd_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0c5f1d3b-9e4d-4740-aa8c-c12e920ff968")
    public String getHwComponent_AssociationEnd_kind() {
        return this.elt.getTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_AssociationEnd_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("64240305-4c12-4c35-86b3-ed061aa15de3")
    public String getHwComponent_AssociationEnd_nbPins() {
        return this.elt.getTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_NBPINS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_AssociationEnd_position'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d2f8b4a8-109a-4fda-b413-5b5bf01e3168")
    public List<String> getHwComponent_AssociationEnd_position() {
        return this.elt.getTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_POSITION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_AssociationEnd_poweredServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("73d5f874-e264-4d49-8417-be074177e21e")
    public List<String> getHwComponent_AssociationEnd_poweredServices() {
        return this.elt.getTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_POWEREDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_AssociationEnd_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4df440de-b93b-49b7-8ae7-8347f349934e")
    public String getHwComponent_AssociationEnd_price() {
        return this.elt.getTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_PRICE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_AssociationEnd_r_Conditions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c140a919-9e71-4cd3-8cfb-d92a30547502")
    public List<String> getHwComponent_AssociationEnd_r_Conditions() {
        return this.elt.getTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_R_CONDITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_AssociationEnd_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dcd204b9-0acb-4cc8-a357-5dbdf4f36e87")
    public String getHwComponent_AssociationEnd_staticConsumption() {
        return this.elt.getTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_STATICCONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_AssociationEnd_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("14c7a44e-94da-4204-9c1f-f913e0cacad9")
    public String getHwComponent_AssociationEnd_staticDissipation() {
        return this.elt.getTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_STATICDISSIPATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_AssociationEnd_subComponents'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9fbc096c-5985-4654-b552-62ce83dc99f3")
    public List<String> getHwComponent_AssociationEnd_subComponents() {
        return this.elt.getTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_SUBCOMPONENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_AssociationEnd_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("080906ce-955e-4b4c-96ea-b097ec09f0b5")
    public String getHwComponent_AssociationEnd_weight() {
        return this.elt.getTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_WEIGHT_TAGTYPE_ELT);
    }

    @objid ("58990f4a-23e3-479e-9143-87133af4ef61")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComponent_AssociationEnd_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c49a64be-7dd9-4954-823b-fd9a78a7eda4")
    public void setHwComponent_AssociationEnd_area(final String value) {
        this.elt.putTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_AREA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_AssociationEnd_dimensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("94de4be7-dc6e-43ba-9a94-56f512c42a58")
    public void setHwComponent_AssociationEnd_dimensions(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_DIMENSIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_AssociationEnd_grid'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("24fdf862-33f9-4d05-9d8d-090ea8d937b8")
    public void setHwComponent_AssociationEnd_grid(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_GRID_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_AssociationEnd_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d603acc5-41e2-4505-9a8c-a7c22a8d8e21")
    public void setHwComponent_AssociationEnd_kind(final String value) {
        this.elt.putTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_AssociationEnd_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45afbfda-9620-4d2f-8615-949c9a69cd22")
    public void setHwComponent_AssociationEnd_nbPins(final String value) {
        this.elt.putTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_NBPINS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_AssociationEnd_position'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3395e36f-2a57-4b2b-a4c8-a1c5283ff929")
    public void setHwComponent_AssociationEnd_position(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_POSITION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_AssociationEnd_poweredServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3c8b5785-2336-4271-808a-cab4fecbf7dc")
    public void setHwComponent_AssociationEnd_poweredServices(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_POWEREDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_AssociationEnd_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("244fce6c-d263-45c2-ac18-388a963b1c3e")
    public void setHwComponent_AssociationEnd_price(final String value) {
        this.elt.putTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_PRICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_AssociationEnd_r_Conditions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe037062-26be-4e71-a56a-5d7bc4776c9d")
    public void setHwComponent_AssociationEnd_r_Conditions(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_R_CONDITIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_AssociationEnd_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ae3909f2-6c13-4d9b-b443-4cff6efe1358")
    public void setHwComponent_AssociationEnd_staticConsumption(final String value) {
        this.elt.putTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_STATICCONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_AssociationEnd_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0c8142f8-5a48-4ac2-9296-3e442a752d5e")
    public void setHwComponent_AssociationEnd_staticDissipation(final String value) {
        this.elt.putTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_STATICDISSIPATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_AssociationEnd_subComponents'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("262507c5-4639-4928-afc0-2af991dfcd64")
    public void setHwComponent_AssociationEnd_subComponents(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_SUBCOMPONENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_AssociationEnd_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e0c61a77-a777-4c39-b236-8dba2d6791e4")
    public void setHwComponent_AssociationEnd_weight(final String value) {
        this.elt.putTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_WEIGHT_TAGTYPE_ELT, value);
    }

    @objid ("ab8f52f3-6f72-43f9-8edb-f8b2ee844152")
    protected HwComponentAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("a207e333-bada-47c6-9e40-380b56ff8cce")
    public static final class MdaTypes {
        @objid ("7b13be97-ad95-4a11-88fe-61a0ad41bc61")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("84766a4c-9841-4221-a615-4b7010634b96")
        public static TagType HWCOMPONENT_ASSOCIATIONEND_KIND_TAGTYPE_ELT;

        @objid ("e5da71d3-31a8-4205-8c86-9d0632b959ba")
        public static TagType HWCOMPONENT_ASSOCIATIONEND_DIMENSIONS_TAGTYPE_ELT;

        @objid ("1c1c5e9f-65de-4a2e-af5c-48f7fac5dbc4")
        public static TagType HWCOMPONENT_ASSOCIATIONEND_AREA_TAGTYPE_ELT;

        @objid ("29545936-1213-4695-9595-42561811c03a")
        public static TagType HWCOMPONENT_ASSOCIATIONEND_POSITION_TAGTYPE_ELT;

        @objid ("248c5c2f-a3d6-4425-9c6c-9808d43494bc")
        public static TagType HWCOMPONENT_ASSOCIATIONEND_GRID_TAGTYPE_ELT;

        @objid ("8623a4e0-5341-4d5f-9587-1a6928411e52")
        public static TagType HWCOMPONENT_ASSOCIATIONEND_NBPINS_TAGTYPE_ELT;

        @objid ("729d6bf5-6fbf-469a-b7ed-633b96e8810b")
        public static TagType HWCOMPONENT_ASSOCIATIONEND_WEIGHT_TAGTYPE_ELT;

        @objid ("d1671b38-89e0-4016-b7d5-0d43fbe4a96c")
        public static TagType HWCOMPONENT_ASSOCIATIONEND_PRICE_TAGTYPE_ELT;

        @objid ("25dd7ec8-1bff-4ef4-a3fb-5334365c4e16")
        public static TagType HWCOMPONENT_ASSOCIATIONEND_R_CONDITIONS_TAGTYPE_ELT;

        @objid ("05d85c7a-ef05-41ac-96a6-03a096b9c7bb")
        public static TagType HWCOMPONENT_ASSOCIATIONEND_POWEREDSERVICES_TAGTYPE_ELT;

        @objid ("b234d49c-2532-44c6-9aed-792892ca9b07")
        public static TagType HWCOMPONENT_ASSOCIATIONEND_STATICCONSUMPTION_TAGTYPE_ELT;

        @objid ("ede7e3bc-b8c4-441d-a323-a937f0710425")
        public static TagType HWCOMPONENT_ASSOCIATIONEND_STATICDISSIPATION_TAGTYPE_ELT;

        @objid ("f0c792d5-4db1-466b-b0f0-d4b4ddf35356")
        public static TagType HWCOMPONENT_ASSOCIATIONEND_SUBCOMPONENTS_TAGTYPE_ELT;

        @objid ("031b4e1e-785c-49d6-9ef7-16c6247826b1")
        private static Stereotype MDAASSOCDEP;

        @objid ("b6e2017e-4c75-4976-8e82-afab12a9dfdb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2a9cb4d8-e218-43b0-8aa6-b2ccf9bd0dd4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0188ecd6-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ASSOCIATIONEND_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0188ecdd-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ASSOCIATIONEND_DIMENSIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0188ece4-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ASSOCIATIONEND_AREA_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0188eceb-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ASSOCIATIONEND_POSITION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f2d-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ASSOCIATIONEND_GRID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f34-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ASSOCIATIONEND_NBPINS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f3b-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ASSOCIATIONEND_WEIGHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f42-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ASSOCIATIONEND_PRICE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f49-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ASSOCIATIONEND_R_CONDITIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f50-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ASSOCIATIONEND_POWEREDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f57-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ASSOCIATIONEND_STATICCONSUMPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018db180-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ASSOCIATIONEND_STATICDISSIPATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018db187-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_ASSOCIATIONEND_SUBCOMPONENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018db18e-0ccf-11df-8525-001302895b2b");
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
