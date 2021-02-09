/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.associationend;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.TimingResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwTimingResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwTimingResourceAssociationEnd extends TimingResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "HwTimingResource_AssociationEnd";

    public static final String HWTIMINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE = "HwTimingResource_AssociationEnd_description";

    public static final String HWTIMINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE = "HwTimingResource_AssociationEnd_endPoints";

    public static final String HWTIMINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE = "HwTimingResource_AssociationEnd_frequency";

    public static final String HWTIMINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE = "HwTimingResource_AssociationEnd_ownedHW";

    public static final String HWTIMINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE = "HwTimingResource_AssociationEnd_p_HW_Services";

    public static final String HWTIMINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE = "HwTimingResource_AssociationEnd_r_HW_Services";

    /**
     * Tells whether a {@link HwTimingResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwTimingResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwTimingResource_AssociationEnd >> then instantiate a {@link HwTimingResourceAssociationEnd} proxy.
     * 
     * @return a {@link HwTimingResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static HwTimingResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceAssociationEnd.STEREOTYPE_NAME);
        return HwTimingResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwTimingResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwTimingResourceAssociationEnd} proxy or <i>null</i>.
     */
    public static HwTimingResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return HwTimingResourceAssociationEnd.canInstantiate(obj) ? new HwTimingResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwTimingResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwTimingResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwTimingResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwTimingResourceAssociationEnd.canInstantiate(obj))
        	return new HwTimingResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwTimingResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwTimingResourceAssociationEnd other = (HwTimingResourceAssociationEnd) obj;
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
     * Getter for string property 'HwTimingResource_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwTimingResource_AssociationEnd_description() {
        return this.elt.getTagValue(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_AssociationEnd_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_AssociationEnd_endPoints() {
        return this.elt.getTagValues(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimingResource_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwTimingResource_AssociationEnd_frequency() {
        return this.elt.getTagValue(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_AssociationEnd_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_AssociationEnd_ownedHW() {
        return this.elt.getTagValues(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_AssociationEnd_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_AssociationEnd_p_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_AssociationEnd_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_AssociationEnd_r_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimingResource_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_AssociationEnd_description(final String value) {
        this.elt.putTagValue(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_AssociationEnd_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_AssociationEnd_endPoints(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwTimingResource_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_AssociationEnd_frequency(final String value) {
        this.elt.putTagValue(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_AssociationEnd_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_AssociationEnd_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_AssociationEnd_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_AssociationEnd_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_AssociationEnd_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_AssociationEnd_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwTimingResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01226911-0ccf-11df-8525-001302895b2b");
            HWTIMINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e1228e3-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e1228e4-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e1228e5-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e1228e6-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e1228e8-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6a8c32f2-8dfb-11e0-8741-0027103f347c");
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
