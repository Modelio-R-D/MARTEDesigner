/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.linkend;

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
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.linkend.CommunicationEndPointLinkEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link LinkEnd} with << HwEndPoint_LinkEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwEndPointLinkEnd extends CommunicationEndPointLinkEnd {
    public static final String STEREOTYPE_NAME = "HwEndPoint_LinkEnd";

    public static final String HWENDPOINT_LINKEND_CONNECTEDTO_TAGTYPE = "HwEndPoint_LinkEnd_connectedTo";

    public static final String HWENDPOINT_LINKEND_DESCRIPTION_TAGTYPE = "HwEndPoint_LinkEnd_description";

    public static final String HWENDPOINT_LINKEND_FREQUENCY_TAGTYPE = "HwEndPoint_LinkEnd_frequency";

    public static final String HWENDPOINT_LINKEND_OWNEDHW_TAGTYPE = "HwEndPoint_LinkEnd_ownedHW";

    public static final String HWENDPOINT_LINKEND_P_HW_SERVICES_TAGTYPE = "HwEndPoint_LinkEnd_p_HW_Services";

    public static final String HWENDPOINT_LINKEND_R_HW_SERVICES_TAGTYPE = "HwEndPoint_LinkEnd_r_HW_Services";

    /**
     * Tells whether a {@link HwEndPointLinkEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link LinkEnd} stereotyped << HwEndPoint_LinkEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof LinkEnd) && ((LinkEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointLinkEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link LinkEnd} stereotyped << HwEndPoint_LinkEnd >> then instantiate a {@link HwEndPointLinkEnd} proxy.
     * 
     * @return a {@link HwEndPointLinkEnd} proxy on the created {@link LinkEnd}.
     */
    public static HwEndPointLinkEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.LinkEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointLinkEnd.STEREOTYPE_NAME);
        return HwEndPointLinkEnd.instantiate((LinkEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwEndPointLinkEnd} proxy from a {@link LinkEnd} stereotyped << HwEndPoint_LinkEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a LinkEnd
     * @return a {@link HwEndPointLinkEnd} proxy or <i>null</i>.
     */
    public static HwEndPointLinkEnd instantiate(final LinkEnd obj) {
        return HwEndPointLinkEnd.canInstantiate(obj) ? new HwEndPointLinkEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwEndPointLinkEnd} proxy from a {@link LinkEnd} stereotyped << HwEndPoint_LinkEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link LinkEnd}
     * @return a {@link HwEndPointLinkEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwEndPointLinkEnd safeInstantiate(final LinkEnd obj) throws IllegalArgumentException {
        if (HwEndPointLinkEnd.canInstantiate(obj))
        	return new HwEndPointLinkEnd(obj);
        else
        	throw new IllegalArgumentException("HwEndPointLinkEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwEndPointLinkEnd other = (HwEndPointLinkEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link LinkEnd}. 
     * @return the LinkEnd represented by this proxy, never null.
     */
    @Override
    public LinkEnd getElement() {
        return (LinkEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwEndPoint_LinkEnd_connectedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwEndPoint_LinkEnd_connectedTo() {
        return this.elt.getTagValues(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_CONNECTEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_LinkEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwEndPoint_LinkEnd_description() {
        return this.elt.getTagValue(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_LinkEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwEndPoint_LinkEnd_frequency() {
        return this.elt.getTagValue(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_LinkEnd_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwEndPoint_LinkEnd_ownedHW() {
        return this.elt.getTagValues(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_LinkEnd_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwEndPoint_LinkEnd_p_HW_Services() {
        return this.elt.getTagValues(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_LinkEnd_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwEndPoint_LinkEnd_r_HW_Services() {
        return this.elt.getTagValues(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwEndPoint_LinkEnd_connectedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_LinkEnd_connectedTo(final List<String> values) {
        this.elt.putTagValues(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_CONNECTEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwEndPoint_LinkEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_LinkEnd_description(final String value) {
        this.elt.putTagValue(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwEndPoint_LinkEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_LinkEnd_frequency(final String value) {
        this.elt.putTagValue(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_LinkEnd_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_LinkEnd_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_LinkEnd_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_LinkEnd_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_LinkEnd_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_LinkEnd_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwEndPointLinkEnd(final LinkEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWENDPOINT_LINKEND_CONNECTEDTO_TAGTYPE_ELT;

        public static TagType HWENDPOINT_LINKEND_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWENDPOINT_LINKEND_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWENDPOINT_LINKEND_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWENDPOINT_LINKEND_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWENDPOINT_LINKEND_FREQUENCY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5e0bd798-32a9-11df-9294-001302895b2b");
            HWENDPOINT_LINKEND_CONNECTEDTO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5e0bd799-32a9-11df-9294-001302895b2b");
            HWENDPOINT_LINKEND_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4f631740-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_LINKEND_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4f631741-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_LINKEND_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4f631742-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_LINKEND_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4f633e51-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_LINKEND_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4f633e52-92a9-11e0-a69d-0027103f347c");
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
