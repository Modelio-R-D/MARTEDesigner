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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwSupport_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b0a47737-4349-4e02-8053-16ec245946b4")
public class HwSupportAttribute extends HwDeviceAttribute {
    @objid ("c310969d-22aa-4161-8393-93aa006a7a2f")
    public static final String STEREOTYPE_NAME = "HwSupport_Attribute";

    /**
     * Tells whether a {@link HwSupportAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwSupport_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ac2a1015-bf82-419d-bb88-572ba94f3f1a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwSupport_Attribute >> then instantiate a {@link HwSupportAttribute} proxy.
     * 
     * @return a {@link HwSupportAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("49e0e361-2a17-4761-bad2-0906f49ab168")
    public static HwSupportAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportAttribute.STEREOTYPE_NAME);
        return HwSupportAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwSupportAttribute} proxy from a {@link Attribute} stereotyped << HwSupport_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwSupportAttribute} proxy or <i>null</i>.
     */
    @objid ("d2abc9b2-21df-46f7-9974-b73ec6205a85")
    public static HwSupportAttribute instantiate(final Attribute obj) {
        return HwSupportAttribute.canInstantiate(obj) ? new HwSupportAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwSupportAttribute} proxy from a {@link Attribute} stereotyped << HwSupport_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwSupportAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("43b2fc81-2672-47fb-8157-b65b8f7c1fa1")
    public static HwSupportAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwSupportAttribute.canInstantiate(obj))
        	return new HwSupportAttribute(obj);
        else
        	throw new IllegalArgumentException("HwSupportAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1500f13c-cace-4950-8e38-3c1160a9c825")
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
        HwSupportAttribute other = (HwSupportAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("185a8f20-ca63-40ea-a84a-dfa577c5a5c4")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("e3cefacd-706c-49f7-bc74-510fe4029df1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9f97fa11-8dd6-4aad-877b-fdb1bf059b90")
    protected HwSupportAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("7946b590-3be7-4f93-b4b3-0f57f0d9801b")
    public static final class MdaTypes {
        @objid ("d33fc70e-e180-49a9-ae8f-ea38a1cd1240")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bcac76dd-2980-494d-a4f1-5f571616997a")
        private static Stereotype MDAASSOCDEP;

        @objid ("44b24fa4-91a3-4c82-8982-ad5f08a05ed6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ee5ec0c5-2853-4d30-ac0f-89f4aba7ff24")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "013ca299-0ccf-11df-8525-001302895b2b");
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
