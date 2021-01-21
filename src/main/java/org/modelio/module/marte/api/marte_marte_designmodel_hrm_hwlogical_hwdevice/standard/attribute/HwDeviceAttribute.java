/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.attribute.HwResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwDevice_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b692c93e-aa0c-4e6c-aff2-8a7b2b0aec3b")
public class HwDeviceAttribute extends HwResourceAttribute {
    @objid ("3564575e-a555-454e-90f2-9dcd65940005")
    public static final String STEREOTYPE_NAME = "HwDevice_Attribute";

    @objid ("4349ef0e-e81b-458f-9972-5709166aa016")
    public static final String HWDEVICE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE = "HwDevice_Attribute_mainScheduler";

    @objid ("60d58adf-486e-42e9-8a97-57e16fcac0ad")
    public static final String HWDEVICE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE = "HwDevice_Attribute_speedFactor";

    /**
     * Tells whether a {@link HwDeviceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwDevice_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1c4bd68b-a661-4944-b466-7670bf45d94d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwDevice_Attribute >> then instantiate a {@link HwDeviceAttribute} proxy.
     * 
     * @return a {@link HwDeviceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("0fdb3cde-0add-413b-9442-b2d85a8f431b")
    public static HwDeviceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceAttribute.STEREOTYPE_NAME);
        return HwDeviceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwDeviceAttribute} proxy from a {@link Attribute} stereotyped << HwDevice_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwDeviceAttribute} proxy or <i>null</i>.
     */
    @objid ("f81d5c63-6a3e-49fa-9d7b-f8bd71b68b4a")
    public static HwDeviceAttribute instantiate(final Attribute obj) {
        return HwDeviceAttribute.canInstantiate(obj) ? new HwDeviceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDeviceAttribute} proxy from a {@link Attribute} stereotyped << HwDevice_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwDeviceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("86a5a864-643d-4549-b9ca-cb44f13ce687")
    public static HwDeviceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwDeviceAttribute.canInstantiate(obj))
        	return new HwDeviceAttribute(obj);
        else
        	throw new IllegalArgumentException("HwDeviceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d8d94d71-c2f1-47dd-82c3-a63c7b8797d9")
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
        HwDeviceAttribute other = (HwDeviceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("7487d5ae-dfcb-4c0f-aed4-01136cb94ac8")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwDevice_Attribute_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5137a408-d01a-42d4-bc67-749af98d4483")
    public String getHwDevice_Attribute_mainScheduler() {
        return this.elt.getTagValue(HwDeviceAttribute.MdaTypes.HWDEVICE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDevice_Attribute_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("43c1133b-b00f-4273-ab4f-ec089539a6a7")
    public String getHwDevice_Attribute_speedFactor() {
        return this.elt.getTagValue(HwDeviceAttribute.MdaTypes.HWDEVICE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("77deda89-3b2e-415a-8361-a123d27c34b0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDevice_Attribute_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fd6ce907-e36a-4512-90a6-8268c11e1dff")
    public void setHwDevice_Attribute_mainScheduler(final String value) {
        this.elt.putTagValue(HwDeviceAttribute.MdaTypes.HWDEVICE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDevice_Attribute_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6131a381-499a-4232-bd98-1d900d15c3ae")
    public void setHwDevice_Attribute_speedFactor(final String value) {
        this.elt.putTagValue(HwDeviceAttribute.MdaTypes.HWDEVICE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("8520eb81-f89c-41bb-af6b-a8eb4d01c3fb")
    protected HwDeviceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("5ad8343e-a472-4581-ad0f-9448a8bd01e2")
    public static final class MdaTypes {
        @objid ("2fa8a879-b12a-4784-b7ab-6f336de0ef62")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("631dd5aa-4dfe-4e35-b777-19f33ff900ed")
        public static TagType HWDEVICE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("c7eb1be5-9797-46fa-81e1-65982adaba81")
        public static TagType HWDEVICE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("0ec5aecc-25cd-4166-8a0d-fc1b58946b95")
        private static Stereotype MDAASSOCDEP;

        @objid ("6d277e84-a390-43ac-aa9a-87e594fa57e7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("42af1059-effd-4c77-9ce4-33e18407c72f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0130b6ff-0ccf-11df-8525-001302895b2b");
            HWDEVICE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "50e16d75-92ab-11e0-a69d-0027103f347c");
            HWDEVICE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "50e16d76-92ab-11e0-a69d-0027103f347c");
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
