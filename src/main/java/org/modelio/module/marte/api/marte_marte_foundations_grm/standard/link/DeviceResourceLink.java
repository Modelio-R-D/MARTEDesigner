/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << DeviceResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("31cf68fe-e235-447a-946c-6e0328a3ad8f")
public class DeviceResourceLink extends ProcessingResourceLink {
    @objid ("7014ba75-ffe5-4b86-b5fa-595f75580c9f")
    public static final String STEREOTYPE_NAME = "DeviceResource_Link";

    /**
     * Tells whether a {@link DeviceResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << DeviceResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b07e97c5-bed4-4751-8270-399d8255ec22")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << DeviceResource_Link >> then instantiate a {@link DeviceResourceLink} proxy.
     * 
     * @return a {@link DeviceResourceLink} proxy on the created {@link Link}.
     */
    @objid ("82bb883e-4885-40c7-a322-9f68f1155e0f")
    public static DeviceResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceLink.STEREOTYPE_NAME);
        return DeviceResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link DeviceResourceLink} proxy from a {@link Link} stereotyped << DeviceResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link DeviceResourceLink} proxy or <i>null</i>.
     */
    @objid ("6bfd70c0-579f-4feb-b391-763dfe334b53")
    public static DeviceResourceLink instantiate(final Link obj) {
        return DeviceResourceLink.canInstantiate(obj) ? new DeviceResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceResourceLink} proxy from a {@link Link} stereotyped << DeviceResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link DeviceResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("41f63440-a6de-4e3b-89ff-9dbf8926db0c")
    public static DeviceResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (DeviceResourceLink.canInstantiate(obj))
        	return new DeviceResourceLink(obj);
        else
        	throw new IllegalArgumentException("DeviceResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d9db7128-a860-4e41-bd75-735363453760")
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
        DeviceResourceLink other = (DeviceResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("07e28c02-268d-40a1-a8f1-3fea5121a5ae")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("25820e6e-b71b-4d3f-968b-68d60e34e517")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("14c4cf28-c89b-443d-96ba-60c396976c83")
    protected DeviceResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("f075d49d-c30d-4e32-94f2-b330701b6b4b")
    public static final class MdaTypes {
        @objid ("d0124c0c-81a9-4790-9f81-707c10e4a0a4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("08e9880d-1a48-4ba2-ab05-8f39d62cb3a8")
        private static Stereotype MDAASSOCDEP;

        @objid ("f1e640dd-1f4a-4717-a389-6ba12914face")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("31b36381-f0f4-40aa-913d-4d9e550f217e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009a84da-0ccf-11df-8525-001302895b2b");
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
