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
@objid ("9a7dabd3-6b1a-48e8-984d-508c15c69b85")
public class HwMediaAttribute extends HwCommunicationResourceAttribute {
    @objid ("1c91ba5a-b3e5-4c5f-bf24-59e359e5099c")
    public static final String STEREOTYPE_NAME = "HwMedia_Attribute";

    @objid ("2c517d05-c0a0-4aea-83e1-c1cba3b2e950")
    public static final String HWMEDIA_ATTRIBUTE_ARBITERS_TAGTYPE = "HwMedia_Attribute_arbiters";

    @objid ("e7355fbc-afb0-4daf-9dad-403d4887895d")
    public static final String HWMEDIA_ATTRIBUTE_BANDWIDTH_TAGTYPE = "HwMedia_Attribute_bandwidth";

    /**
     * Tells whether a {@link HwMediaAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwMedia_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0a66bf97-0db2-4a40-bf43-76c35c570e02")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwMedia_Attribute >> then instantiate a {@link HwMediaAttribute} proxy.
     * 
     * @return a {@link HwMediaAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("bdf66e5b-50dd-44ef-93fe-0d2ad6ffffbf")
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
    @objid ("528eecbb-5d8e-4cf7-849f-a5d7518a3132")
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
    @objid ("d7dbd454-7a8e-4f15-a6ce-a640a3648372")
    public static HwMediaAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwMediaAttribute.canInstantiate(obj))
        	return new HwMediaAttribute(obj);
        else
        	throw new IllegalArgumentException("HwMediaAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bec02576-899f-473e-ac61-bbf6cfa988d6")
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
    @objid ("4394eb68-71dd-4e82-97ed-ac39697e5833")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwMedia_Attribute_arbiters'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1691d6bc-5ae2-4c15-8415-25c0702ccf3b")
    public List<String> getHwMedia_Attribute_arbiters() {
        return this.elt.getTagValues(HwMediaAttribute.MdaTypes.HWMEDIA_ATTRIBUTE_ARBITERS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMedia_Attribute_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1a7392e6-49a0-437c-ae14-5edabcd16c32")
    public String getHwMedia_Attribute_bandwidth() {
        return this.elt.getTagValue(HwMediaAttribute.MdaTypes.HWMEDIA_ATTRIBUTE_BANDWIDTH_TAGTYPE_ELT);
    }

    @objid ("d47ceada-d777-4212-a5c0-8c8ff6fd71c0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwMedia_Attribute_arbiters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("72f22753-0d33-4eff-95ca-ba7aceecab8f")
    public void setHwMedia_Attribute_arbiters(final List<String> values) {
        this.elt.putTagValues(HwMediaAttribute.MdaTypes.HWMEDIA_ATTRIBUTE_ARBITERS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMedia_Attribute_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("59beb30b-90df-4038-8172-d546e85e3f9c")
    public void setHwMedia_Attribute_bandwidth(final String value) {
        this.elt.putTagValue(HwMediaAttribute.MdaTypes.HWMEDIA_ATTRIBUTE_BANDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("c668b74b-68b5-454b-ab8b-903f5a90d6fa")
    protected HwMediaAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("19767d8c-dd67-4802-8b1d-634a0e4d5970")
    public static final class MdaTypes {
        @objid ("b24d137e-8642-4a71-9534-b1af5e02dc89")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("94c0d29a-fd8e-4238-bcff-ce1456b9acab")
        public static TagType HWMEDIA_ATTRIBUTE_ARBITERS_TAGTYPE_ELT;

        @objid ("9437201d-2d8e-40da-857f-1091cb9084fd")
        public static TagType HWMEDIA_ATTRIBUTE_BANDWIDTH_TAGTYPE_ELT;

        @objid ("454cd2f6-7ff0-4bc9-8978-92d47bcd78fd")
        private static Stereotype MDAASSOCDEP;

        @objid ("c4629a1b-1f55-46f1-98c4-5e34f947eab3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6c3fbf86-9aeb-44c8-aeb1-5fc3b8688580")
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
