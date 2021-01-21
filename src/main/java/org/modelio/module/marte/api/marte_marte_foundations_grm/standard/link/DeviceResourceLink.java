/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("833485ef-7c16-4d4b-ad07-fa00964abb27")
    public static final String STEREOTYPE_NAME = "DeviceResource_Link";

    /**
     * Tells whether a {@link DeviceResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << DeviceResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5cb20c97-c886-4700-af27-e17cf9e3ba86")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << DeviceResource_Link >> then instantiate a {@link DeviceResourceLink} proxy.
     * 
     * @return a {@link DeviceResourceLink} proxy on the created {@link Link}.
     */
    @objid ("2ac04aa0-c2c9-4742-85e9-00ddc3f8c40b")
    public static DeviceResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceLink.STEREOTYPE_NAME);
        return DeviceResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link DeviceResourceLink} proxy from a {@link Link} stereotyped << DeviceResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link DeviceResourceLink} proxy or <i>null</i>.
     */
    @objid ("d23659e5-a695-453b-bab6-3ea5fb146519")
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
    @objid ("088ee693-f2fb-4e70-bf12-114c8cadf560")
    public static DeviceResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (DeviceResourceLink.canInstantiate(obj))
        	return new DeviceResourceLink(obj);
        else
        	throw new IllegalArgumentException("DeviceResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("78aa2d27-c6ba-4494-8731-305e42e4f09b")
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
    @objid ("a5c287f9-efb9-46db-ad1b-3945f89c6e89")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("a70c2867-c10b-4b93-9054-34c3c64bd968")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0afd515e-4ba3-483d-a65f-8afa1547fba9")
    protected DeviceResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("f075d49d-c30d-4e32-94f2-b330701b6b4b")
    public static final class MdaTypes {
        @objid ("37a24cd5-c1b8-40b7-bed2-ce1dc6c3b6ab")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("59230251-2420-4548-b13d-754eb78a09d3")
        private static Stereotype MDAASSOCDEP;

        @objid ("f976848f-8f10-41b0-8dd1-c92738647353")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b0ee2c91-9ebd-4ba0-a832-4f2ec20c7dc2")
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
