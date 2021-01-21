/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << DeviceResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7cc470b9-b9b2-4aeb-a52b-3fc0087ee912")
public class DeviceResourceAttribute extends ProcessingResourceAttribute {
    @objid ("3d199873-8343-43ef-b797-073d3462fd96")
    public static final String STEREOTYPE_NAME = "DeviceResource_Attribute";

    /**
     * Tells whether a {@link DeviceResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << DeviceResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7612d855-6ef3-452a-9e6d-be406a46c527")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << DeviceResource_Attribute >> then instantiate a {@link DeviceResourceAttribute} proxy.
     * 
     * @return a {@link DeviceResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("049cdfd0-3680-40fa-b835-959bc062a76b")
    public static DeviceResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceAttribute.STEREOTYPE_NAME);
        return DeviceResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link DeviceResourceAttribute} proxy from a {@link Attribute} stereotyped << DeviceResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link DeviceResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("1c0960be-f9d5-49ea-938c-bcfd9d85d7a7")
    public static DeviceResourceAttribute instantiate(final Attribute obj) {
        return DeviceResourceAttribute.canInstantiate(obj) ? new DeviceResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceResourceAttribute} proxy from a {@link Attribute} stereotyped << DeviceResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link DeviceResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f9a17583-54bd-4c22-94ea-1c8eec492c8d")
    public static DeviceResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (DeviceResourceAttribute.canInstantiate(obj))
        	return new DeviceResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("DeviceResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("05ea3205-139a-4b4d-b417-5de6ff8756f7")
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
        DeviceResourceAttribute other = (DeviceResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("144e2388-ab17-4651-a5a6-36f7d366d85d")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("84d7e36b-2799-4f01-b3ef-0a2ec709046e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("afb8ff7f-a0b0-47ac-a2a2-ae88840b8ba0")
    protected DeviceResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("0ec8055e-aba9-40ec-89f7-a06e2f8c3724")
    public static final class MdaTypes {
        @objid ("f40a3d7a-f40a-4afa-8061-b8df27778969")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("80b66071-09d2-424d-9e37-ba42beef8b62")
        private static Stereotype MDAASSOCDEP;

        @objid ("9faf7cf0-b121-4e70-8532-7826e6b13bef")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4c612585-c0da-4495-bca2-81c2f5952f83")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009a84d9-0ccf-11df-8525-001302895b2b");
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
