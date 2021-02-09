/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.association.HwResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwComponent_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwComponentAssociation extends HwResourceAssociation {
    public static final String STEREOTYPE_NAME = "HwComponent_Association";

    public static final String HWCOMPONENT_ASSOCIATION_AREA_TAGTYPE = "HwComponent_Association_area";

    public static final String HWCOMPONENT_ASSOCIATION_DIMENSIONS_TAGTYPE = "HwComponent_Association_dimensions";

    public static final String HWCOMPONENT_ASSOCIATION_GRID_TAGTYPE = "HwComponent_Association_grid";

    public static final String HWCOMPONENT_ASSOCIATION_KIND_TAGTYPE = "HwComponent_Association_kind";

    public static final String HWCOMPONENT_ASSOCIATION_NBPINS_TAGTYPE = "HwComponent_Association_nbPins";

    public static final String HWCOMPONENT_ASSOCIATION_POSITION_TAGTYPE = "HwComponent_Association_position";

    public static final String HWCOMPONENT_ASSOCIATION_POWEREDSERVICES_TAGTYPE = "HwComponent_Association_poweredServices";

    public static final String HWCOMPONENT_ASSOCIATION_PRICE_TAGTYPE = "HwComponent_Association_price";

    public static final String HWCOMPONENT_ASSOCIATION_R_CONDITIONS_TAGTYPE = "HwComponent_Association_r_Conditions";

    public static final String HWCOMPONENT_ASSOCIATION_STATICCONSUMPTION_TAGTYPE = "HwComponent_Association_staticConsumption";

    public static final String HWCOMPONENT_ASSOCIATION_STATICDISSIPATION_TAGTYPE = "HwComponent_Association_staticDissipation";

    public static final String HWCOMPONENT_ASSOCIATION_SUBCOMPONENTS_TAGTYPE = "HwComponent_Association_subComponents";

    public static final String HWCOMPONENT_ASSOCIATION_WEIGHT_TAGTYPE = "HwComponent_Association_weight";

    /**
     * Tells whether a {@link HwComponentAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwComponent_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwComponent_Association >> then instantiate a {@link HwComponentAssociation} proxy.
     * 
     * @return a {@link HwComponentAssociation} proxy on the created {@link Association}.
     */
    public static HwComponentAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentAssociation.STEREOTYPE_NAME);
        return HwComponentAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwComponentAssociation} proxy from a {@link Association} stereotyped << HwComponent_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwComponentAssociation} proxy or <i>null</i>.
     */
    public static HwComponentAssociation instantiate(final Association obj) {
        return HwComponentAssociation.canInstantiate(obj) ? new HwComponentAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComponentAssociation} proxy from a {@link Association} stereotyped << HwComponent_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwComponentAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwComponentAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwComponentAssociation.canInstantiate(obj))
        	return new HwComponentAssociation(obj);
        else
        	throw new IllegalArgumentException("HwComponentAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwComponentAssociation other = (HwComponentAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwComponent_Association_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Association_area() {
        return this.elt.getTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_AREA_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Association_dimensions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Association_dimensions() {
        return this.elt.getTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_DIMENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Association_grid'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Association_grid() {
        return this.elt.getTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_GRID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Association_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Association_kind() {
        return this.elt.getTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Association_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Association_nbPins() {
        return this.elt.getTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_NBPINS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Association_position'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Association_position() {
        return this.elt.getTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_POSITION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Association_poweredServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Association_poweredServices() {
        return this.elt.getTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_POWEREDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Association_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Association_price() {
        return this.elt.getTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_PRICE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Association_r_Conditions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Association_r_Conditions() {
        return this.elt.getTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_R_CONDITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Association_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Association_staticConsumption() {
        return this.elt.getTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_STATICCONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Association_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Association_staticDissipation() {
        return this.elt.getTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_STATICDISSIPATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Association_subComponents'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Association_subComponents() {
        return this.elt.getTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_SUBCOMPONENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Association_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Association_weight() {
        return this.elt.getTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_WEIGHT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComponent_Association_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Association_area(final String value) {
        this.elt.putTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_AREA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Association_dimensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Association_dimensions(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_DIMENSIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Association_grid'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Association_grid(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_GRID_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Association_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Association_kind(final String value) {
        this.elt.putTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Association_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Association_nbPins(final String value) {
        this.elt.putTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_NBPINS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Association_position'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Association_position(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_POSITION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Association_poweredServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Association_poweredServices(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_POWEREDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Association_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Association_price(final String value) {
        this.elt.putTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_PRICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Association_r_Conditions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Association_r_Conditions(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_R_CONDITIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Association_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Association_staticConsumption(final String value) {
        this.elt.putTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_STATICCONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Association_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Association_staticDissipation(final String value) {
        this.elt.putTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_STATICDISSIPATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Association_subComponents'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Association_subComponents(final List<String> values) {
        this.elt.putTagValues(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_SUBCOMPONENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Association_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Association_weight(final String value) {
        this.elt.putTagValue(HwComponentAssociation.MdaTypes.HWCOMPONENT_ASSOCIATION_WEIGHT_TAGTYPE_ELT, value);
    }

    protected HwComponentAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATION_KIND_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATION_DIMENSIONS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATION_AREA_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATION_POSITION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATION_GRID_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATION_NBPINS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATION_WEIGHT_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATION_PRICE_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATION_R_CONDITIONS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATION_POWEREDSERVICES_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATION_STATICCONSUMPTION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATION_STATICDISSIPATION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_ASSOCIATION_SUBCOMPONENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "76a0ebe6-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebeb-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_DIMENSIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebe7-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_AREA_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebec-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_POSITION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebed-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_GRID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebe8-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_NBPINS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebe9-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_WEIGHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebea-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_PRICE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebee-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_R_CONDITIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebef-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_POWEREDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebf0-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_STATICCONSUMPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebf1-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_STATICDISSIPATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebf2-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_ASSOCIATION_SUBCOMPONENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76a0ebf3-10b4-11df-81d9-0014222a9f79");
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
