/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.CommunicationEndPointAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwEndPoint_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwEndPointAssociation extends CommunicationEndPointAssociation {
    public static final String STEREOTYPE_NAME = "HwEndPoint_Association";

    public static final String HWENDPOINT_ASSOCIATION_CONNECTEDTO_TAGTYPE = "HwEndPoint_Association_connectedTo";

    public static final String HWENDPOINT_ASSOCIATION_DESCRIPTION_TAGTYPE = "HwEndPoint_Association_description";

    public static final String HWENDPOINT_ASSOCIATION_FREQUENCY_TAGTYPE = "HwEndPoint_Association_frequency";

    public static final String HWENDPOINT_ASSOCIATION_OWNEDHW_TAGTYPE = "HwEndPoint_Association_ownedHW";

    public static final String HWENDPOINT_ASSOCIATION_P_HW_SERVICES_TAGTYPE = "HwEndPoint_Association_p_HW_Services";

    public static final String HWENDPOINT_ASSOCIATION_R_HW_SERVICES_TAGTYPE = "HwEndPoint_Association_r_HW_Services";

    /**
     * Tells whether a {@link HwEndPointAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwEndPoint_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwEndPoint_Association >> then instantiate a {@link HwEndPointAssociation} proxy.
     * 
     * @return a {@link HwEndPointAssociation} proxy on the created {@link Association}.
     */
    public static HwEndPointAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointAssociation.STEREOTYPE_NAME);
        return HwEndPointAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwEndPointAssociation} proxy from a {@link Association} stereotyped << HwEndPoint_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwEndPointAssociation} proxy or <i>null</i>.
     */
    public static HwEndPointAssociation instantiate(final Association obj) {
        return HwEndPointAssociation.canInstantiate(obj) ? new HwEndPointAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwEndPointAssociation} proxy from a {@link Association} stereotyped << HwEndPoint_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwEndPointAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwEndPointAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwEndPointAssociation.canInstantiate(obj))
        	return new HwEndPointAssociation(obj);
        else
        	throw new IllegalArgumentException("HwEndPointAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwEndPointAssociation other = (HwEndPointAssociation) obj;
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
     * Getter for List<String> property 'HwEndPoint_Association_connectedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwEndPoint_Association_connectedTo() {
        return this.elt.getTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_CONNECTEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwEndPoint_Association_description() {
        return this.elt.getTagValue(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwEndPoint_Association_frequency() {
        return this.elt.getTagValue(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Association_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwEndPoint_Association_ownedHW() {
        return this.elt.getTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Association_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwEndPoint_Association_p_HW_Services() {
        return this.elt.getTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Association_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwEndPoint_Association_r_HW_Services() {
        return this.elt.getTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Association_connectedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_Association_connectedTo(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_CONNECTEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwEndPoint_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_Association_description(final String value) {
        this.elt.putTagValue(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwEndPoint_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_Association_frequency(final String value) {
        this.elt.putTagValue(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Association_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_Association_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Association_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_Association_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Association_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_Association_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwEndPointAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWENDPOINT_ASSOCIATION_CONNECTEDTO_TAGTYPE_ELT;

        public static TagType HWENDPOINT_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWENDPOINT_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWENDPOINT_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWENDPOINT_ASSOCIATION_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWENDPOINT_ASSOCIATION_FREQUENCY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3cdf782a-10ac-11df-81d9-0014222a9f79");
            HWENDPOINT_ASSOCIATION_CONNECTEDTO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e64926e0-1726-11df-b92a-0014222a9f79");
            HWENDPOINT_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48c24be1-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48c24be2-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48c24be3-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATION_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48c24be4-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATION_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48c24be5-92a9-11e0-a69d-0027103f347c");
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
