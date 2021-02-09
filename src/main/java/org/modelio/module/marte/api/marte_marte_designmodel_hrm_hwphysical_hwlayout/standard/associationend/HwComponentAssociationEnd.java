/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class HwComponentAssociationEnd extends HwResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "HwComponent_AssociationEnd";

    public static final String HWCOMPONENT_ASSOCIATIONEND_AREA_TAGTYPE = "HwComponent_AssociationEnd_area";

    public static final String HWCOMPONENT_ASSOCIATIONEND_DIMENSIONS_TAGTYPE = "HwComponent_AssociationEnd_dimensions";

    public static final String HWCOMPONENT_ASSOCIATIONEND_GRID_TAGTYPE = "HwComponent_AssociationEnd_grid";

    public static final String HWCOMPONENT_ASSOCIATIONEND_KIND_TAGTYPE = "HwComponent_AssociationEnd_kind";

    public static final String HWCOMPONENT_ASSOCIATIONEND_NBPINS_TAGTYPE = "HwComponent_AssociationEnd_nbPins";

    public static final String HWCOMPONENT_ASSOCIATIONEND_POSITION_TAGTYPE = "HwComponent_AssociationEnd_position";

    public static final String HWCOMPONENT_ASSOCIATIONEND_POWEREDSERVICES_TAGTYPE = "HwComponent_AssociationEnd_poweredServices";

    public static final String HWCOMPONENT_ASSOCIATIONEND_PRICE_TAGTYPE = "HwComponent_AssociationEnd_price";

    public static final String HWCOMPONENT_ASSOCIATIONEND_R_CONDITIONS_TAGTYPE = "HwComponent_AssociationEnd_r_Conditions";

    public static final String HWCOMPONENT_ASSOCIATIONEND_STATICCONSUMPTION_TAGTYPE = "HwComponent_AssociationEnd_staticConsumption";

    public static final String HWCOMPONENT_ASSOCIATIONEND_STATICDISSIPATION_TAGTYPE = "HwComponent_AssociationEnd_staticDissipation";

    public static final String HWCOMPONENT_ASSOCIATIONEND_SUBCOMPONENTS_TAGTYPE = "HwComponent_AssociationEnd_subComponents";

    public static final String HWCOMPONENT_ASSOCIATIONEND_WEIGHT_TAGTYPE = "HwComponent_AssociationEnd_weight";

    /**
     * Tells whether a {@link HwComponentAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwComponent_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwComponent_AssociationEnd >> then instantiate a {@link HwComponentAssociationEnd} proxy.
     * 
     * @return a {@link HwComponentAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static HwComponentAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentAssociationEnd.STEREOTYPE_NAME);
        return HwComponentAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwComponentAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwComponent_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwComponentAssociationEnd} proxy or <i>null</i>.
     */
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
    public static HwComponentAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwComponentAssociationEnd.canInstantiate(obj))
        	return new HwComponentAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwComponentAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwComponent_AssociationEnd_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_AssociationEnd_area() {
        return this.elt.getTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_AREA_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_AssociationEnd_dimensions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_AssociationEnd_dimensions() {
        return this.elt.getTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_DIMENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_AssociationEnd_grid'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_AssociationEnd_grid() {
        return this.elt.getTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_GRID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_AssociationEnd_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_AssociationEnd_kind() {
        return this.elt.getTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_AssociationEnd_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_AssociationEnd_nbPins() {
        return this.elt.getTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_NBPINS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_AssociationEnd_position'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_AssociationEnd_position() {
        return this.elt.getTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_POSITION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_AssociationEnd_poweredServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_AssociationEnd_poweredServices() {
        return this.elt.getTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_POWEREDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_AssociationEnd_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_AssociationEnd_price() {
        return this.elt.getTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_PRICE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_AssociationEnd_r_Conditions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_AssociationEnd_r_Conditions() {
        return this.elt.getTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_R_CONDITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_AssociationEnd_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_AssociationEnd_staticConsumption() {
        return this.elt.getTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_STATICCONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_AssociationEnd_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_AssociationEnd_staticDissipation() {
        return this.elt.getTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_STATICDISSIPATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_AssociationEnd_subComponents'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_AssociationEnd_subComponents() {
        return this.elt.getTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_SUBCOMPONENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_AssociationEnd_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_AssociationEnd_weight() {
        return this.elt.getTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_WEIGHT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComponent_AssociationEnd_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_AssociationEnd_area(final String value) {
        this.elt.putTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_AREA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_AssociationEnd_dimensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_AssociationEnd_dimensions(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_DIMENSIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_AssociationEnd_grid'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_AssociationEnd_grid(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_GRID_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_AssociationEnd_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_AssociationEnd_kind(final String value) {
        this.elt.putTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_AssociationEnd_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_AssociationEnd_nbPins(final String value) {
        this.elt.putTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_NBPINS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_AssociationEnd_position'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_AssociationEnd_position(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_POSITION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_AssociationEnd_poweredServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_AssociationEnd_poweredServices(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_POWEREDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_AssociationEnd_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_AssociationEnd_price(final String value) {
        this.elt.putTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_PRICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_AssociationEnd_r_Conditions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_AssociationEnd_r_Conditions(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_R_CONDITIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_AssociationEnd_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_AssociationEnd_staticConsumption(final String value) {
        this.elt.putTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_STATICCONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_AssociationEnd_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_AssociationEnd_staticDissipation(final String value) {
        this.elt.putTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_STATICDISSIPATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_AssociationEnd_subComponents'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_AssociationEnd_subComponents(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_SUBCOMPONENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_AssociationEnd_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_AssociationEnd_weight(final String value) {
        this.elt.putTagValue(HwComponentAssociationEnd.MdaTypes.HWCOMPONENT_ASSOCIATIONEND_WEIGHT_TAGTYPE_ELT, value);
    }

    protected HwComponentAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATIONEND_KIND_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATIONEND_DIMENSIONS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATIONEND_AREA_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATIONEND_POSITION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATIONEND_GRID_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATIONEND_NBPINS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATIONEND_WEIGHT_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATIONEND_PRICE_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATIONEND_R_CONDITIONS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATIONEND_POWEREDSERVICES_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATIONEND_STATICCONSUMPTION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATIONEND_STATICDISSIPATION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATIONEND_SUBCOMPONENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
