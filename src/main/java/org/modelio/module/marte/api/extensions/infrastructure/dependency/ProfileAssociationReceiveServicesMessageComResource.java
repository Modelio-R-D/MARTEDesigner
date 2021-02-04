/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_receiveServices_MessageComResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c28e15bc-96ea-46fe-b1a5-38c0f8225abf")
public class ProfileAssociationReceiveServicesMessageComResource {
    @objid ("b4549f9f-7dd8-4812-a600-d742180fa556")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_receiveServices_MessageComResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("cf67d472-1711-4225-97e1-99f5a8cab9c2")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationReceiveServicesMessageComResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_receiveServices_MessageComResource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ff51681f-ad2a-4dec-9865-b179ffe38c8b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationReceiveServicesMessageComResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_receiveServices_MessageComResource >> then instantiate a {@link ProfileAssociationReceiveServicesMessageComResource} proxy.
     * 
     * @return a {@link ProfileAssociationReceiveServicesMessageComResource} proxy on the created {@link Dependency}.
     */
    @objid ("1726b9e5-0c02-4aec-abe5-ab895e52b56c")
    public static ProfileAssociationReceiveServicesMessageComResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationReceiveServicesMessageComResource.STEREOTYPE_NAME);
        return ProfileAssociationReceiveServicesMessageComResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationReceiveServicesMessageComResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_receiveServices_MessageComResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationReceiveServicesMessageComResource} proxy or <i>null</i>.
     */
    @objid ("6c03c6bd-042f-49cf-a5a2-7e9c70c75f35")
    public static ProfileAssociationReceiveServicesMessageComResource instantiate(final Dependency obj) {
        return ProfileAssociationReceiveServicesMessageComResource.canInstantiate(obj) ? new ProfileAssociationReceiveServicesMessageComResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationReceiveServicesMessageComResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_receiveServices_MessageComResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationReceiveServicesMessageComResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c2f06e8b-4b9e-4dc3-a6f1-55bbd4834419")
    public static ProfileAssociationReceiveServicesMessageComResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationReceiveServicesMessageComResource.canInstantiate(obj))
        	return new ProfileAssociationReceiveServicesMessageComResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationReceiveServicesMessageComResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b2f07f27-6af4-46f2-b13a-c3f91a6f49f0")
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
        ProfileAssociationReceiveServicesMessageComResource other = (ProfileAssociationReceiveServicesMessageComResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("ce17404b-f091-459d-b83a-ac0a05a18378")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("5785f294-5b09-4c34-a3d1-647395bb4b28")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a4862745-40c9-4850-981c-912f3dbd2ff6")
    protected ProfileAssociationReceiveServicesMessageComResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("d29eeecb-53eb-4447-854b-3c2b9b064dff")
    public static final class MdaTypes {
        @objid ("ffcdb1d9-4c2f-41ad-94d8-924cdcd0ea85")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("19eda782-d01c-451d-ab92-27dc5ebcb0cb")
        private static Stereotype MDAASSOCDEP;

        @objid ("7b517a9c-b5bc-421c-820f-27cc6b5a1f7b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6fb194e4-12aa-4683-94d7-d968c0446437")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c01d0522-9758-11e0-94fb-0027103f347c");
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
