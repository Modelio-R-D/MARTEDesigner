/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwMedia_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwMediaAttribute extends HwCommunicationResourceAttribute {
    public static final String STEREOTYPE_NAME = "HwMedia_Attribute";

    public static final String HWMEDIA_ATTRIBUTE_ARBITERS_TAGTYPE = "HwMedia_Attribute_arbiters";

    public static final String HWMEDIA_ATTRIBUTE_BANDWIDTH_TAGTYPE = "HwMedia_Attribute_bandwidth";

    /**
     * Tells whether a {@link HwMediaAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwMedia_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwMedia_Attribute >> then instantiate a {@link HwMediaAttribute} proxy.
     * 
     * @return a {@link HwMediaAttribute} proxy on the created {@link Attribute}.
     */
    public static HwMediaAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaAttribute.STEREOTYPE_NAME);
        return HwMediaAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwMediaAttribute} proxy from a {@link Attribute} stereotyped << HwMedia_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwMediaAttribute} proxy or <i>null</i>.
     */
    public static HwMediaAttribute instantiate(final Attribute obj) {
        return HwMediaAttribute.canInstantiate(obj) ? new HwMediaAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMediaAttribute} proxy from a {@link Attribute} stereotyped << HwMedia_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwMediaAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwMediaAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwMediaAttribute.canInstantiate(obj))
        	return new HwMediaAttribute(obj);
        else
        	throw new IllegalArgumentException("HwMediaAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwMediaAttribute other = (HwMediaAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwMedia_Attribute_arbiters'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMedia_Attribute_arbiters() {
        return this.elt.getTagValues(HwMediaAttribute.MdaTypes.HWMEDIA_ATTRIBUTE_ARBITERS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMedia_Attribute_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMedia_Attribute_bandwidth() {
        return this.elt.getTagValue(HwMediaAttribute.MdaTypes.HWMEDIA_ATTRIBUTE_BANDWIDTH_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwMedia_Attribute_arbiters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMedia_Attribute_arbiters(final List<String> values) {
        this.elt.putTagValues(HwMediaAttribute.MdaTypes.HWMEDIA_ATTRIBUTE_ARBITERS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMedia_Attribute_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMedia_Attribute_bandwidth(final String value) {
        this.elt.putTagValue(HwMediaAttribute.MdaTypes.HWMEDIA_ATTRIBUTE_BANDWIDTH_TAGTYPE_ELT, value);
    }

    protected HwMediaAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWMEDIA_ATTRIBUTE_ARBITERS_TAGTYPE_ELT;

        public static TagType HWMEDIA_ATTRIBUTE_BANDWIDTH_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0105cd3b-0ccf-11df-8525-001302895b2b");
            HWMEDIA_ATTRIBUTE_ARBITERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "05514f4c-1727-11df-b92a-0014222a9f79");
            HWMEDIA_ATTRIBUTE_BANDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a13ca6be-5d9c-11df-9e91-0014222a9f79");
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
