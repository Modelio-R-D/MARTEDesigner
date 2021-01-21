/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("e93fee7a-12f1-4b2c-930d-3373bd9d94ef")
    public static final String STEREOTYPE_NAME = "HwMedia_Attribute";

    @objid ("fbad785a-9a96-4983-a101-56f9e0a8f2b0")
    public static final String HWMEDIA_ATTRIBUTE_ARBITERS_TAGTYPE = "HwMedia_Attribute_arbiters";

    @objid ("a7a6c2f5-77d1-41a4-9c68-4215b0944c70")
    public static final String HWMEDIA_ATTRIBUTE_BANDWIDTH_TAGTYPE = "HwMedia_Attribute_bandwidth";

    /**
     * Tells whether a {@link HwMediaAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwMedia_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9ba07aa1-66c0-48a1-83f3-bedf62e8721f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwMedia_Attribute >> then instantiate a {@link HwMediaAttribute} proxy.
     * 
     * @return a {@link HwMediaAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("b0e60ca5-a140-4719-a7b6-88dc45c90e0d")
    public static HwMediaAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaAttribute.STEREOTYPE_NAME);
        return HwMediaAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwMediaAttribute} proxy from a {@link Attribute} stereotyped << HwMedia_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwMediaAttribute} proxy or <i>null</i>.
     */
    @objid ("7b732c83-9bc0-4882-83d0-2e92633528d1")
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
    @objid ("2f698f19-1b54-49b1-aef0-43f4244debb4")
    public static HwMediaAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwMediaAttribute.canInstantiate(obj))
        	return new HwMediaAttribute(obj);
        else
        	throw new IllegalArgumentException("HwMediaAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ec5e4398-1b52-4d53-9503-8dd4c8a69b09")
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
    @objid ("b7d550ff-dd88-4223-aaed-777dc7401012")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwMedia_Attribute_arbiters'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1a1774e2-d957-4360-8469-dd0cadb68e13")
    public List<String> getHwMedia_Attribute_arbiters() {
        return this.elt.getTagValues(HwMediaAttribute.MdaTypes.HWMEDIA_ATTRIBUTE_ARBITERS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMedia_Attribute_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b4f2ccb-6e93-4b7c-be0a-898b8e4ff6e2")
    public String getHwMedia_Attribute_bandwidth() {
        return this.elt.getTagValue(HwMediaAttribute.MdaTypes.HWMEDIA_ATTRIBUTE_BANDWIDTH_TAGTYPE_ELT);
    }

    @objid ("7dc5e740-7d34-43a9-a0ab-155c6eb2babf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwMedia_Attribute_arbiters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("05c67249-361c-4964-9037-e920356d2762")
    public void setHwMedia_Attribute_arbiters(final List<String> values) {
        this.elt.putTagValues(HwMediaAttribute.MdaTypes.HWMEDIA_ATTRIBUTE_ARBITERS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMedia_Attribute_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e488185e-fb13-4124-8c43-f9bad9942f22")
    public void setHwMedia_Attribute_bandwidth(final String value) {
        this.elt.putTagValue(HwMediaAttribute.MdaTypes.HWMEDIA_ATTRIBUTE_BANDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("7e9a2bd2-ac4b-45e7-bcb9-415716ac1ece")
    protected HwMediaAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("19767d8c-dd67-4802-8b1d-634a0e4d5970")
    public static final class MdaTypes {
        @objid ("77b5b07b-0272-46cc-9e07-6062bfc4e2e4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7dfe522c-e7ec-4600-a7cf-3b025ad2ab3c")
        public static TagType HWMEDIA_ATTRIBUTE_ARBITERS_TAGTYPE_ELT;

        @objid ("8fd355de-572f-4bc5-92cf-95212a22478f")
        public static TagType HWMEDIA_ATTRIBUTE_BANDWIDTH_TAGTYPE_ELT;

        @objid ("b958586b-be5e-4d0c-a7d1-6f1c68145218")
        private static Stereotype MDAASSOCDEP;

        @objid ("28b435fb-905b-42b7-a53e-e8dd46fa5321")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b95929dd-1770-457e-8670-93f21fa8d975")
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
