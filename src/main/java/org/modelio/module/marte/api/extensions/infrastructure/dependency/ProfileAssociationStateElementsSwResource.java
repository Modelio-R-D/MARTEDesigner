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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_stateElements_SwResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9d6a1c28-0d6e-43f4-bf8a-621050941db9")
public class ProfileAssociationStateElementsSwResource {
    @objid ("8b6588db-c7b7-4394-8e79-4250392c552f")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_stateElements_SwResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("6cf7f1bd-6459-4c86-b4b4-f965c1d7cfb2")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationStateElementsSwResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_stateElements_SwResource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ffedff8b-f538-400f-81f0-aaa7cb190c5f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationStateElementsSwResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_stateElements_SwResource >> then instantiate a {@link ProfileAssociationStateElementsSwResource} proxy.
     * 
     * @return a {@link ProfileAssociationStateElementsSwResource} proxy on the created {@link Dependency}.
     */
    @objid ("0006d85e-1a83-4ea5-9092-266b1f259618")
    public static ProfileAssociationStateElementsSwResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationStateElementsSwResource.STEREOTYPE_NAME);
        return ProfileAssociationStateElementsSwResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationStateElementsSwResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_stateElements_SwResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationStateElementsSwResource} proxy or <i>null</i>.
     */
    @objid ("2b9b3585-2527-43d6-aa1d-e112af34438a")
    public static ProfileAssociationStateElementsSwResource instantiate(final Dependency obj) {
        return ProfileAssociationStateElementsSwResource.canInstantiate(obj) ? new ProfileAssociationStateElementsSwResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationStateElementsSwResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_stateElements_SwResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationStateElementsSwResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7e6eface-ccc4-49a8-ae33-33aeca0f8bd3")
    public static ProfileAssociationStateElementsSwResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationStateElementsSwResource.canInstantiate(obj))
        	return new ProfileAssociationStateElementsSwResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationStateElementsSwResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a9cec7b1-b916-430d-9995-4cfd51f86cce")
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
        ProfileAssociationStateElementsSwResource other = (ProfileAssociationStateElementsSwResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("5de20186-b402-42f6-80af-d36198aa13d6")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("d7bd6f71-24a4-42ac-b8bf-a58486795ca5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6a847b50-9230-4a4f-972a-ed2aca68a42f")
    protected ProfileAssociationStateElementsSwResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("44ecadc3-88bc-4986-8945-6202ba72c78e")
    public static final class MdaTypes {
        @objid ("135f4e1b-3d06-4118-b65d-54adbfdf72f1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b2722625-eae9-4fef-8eb7-3812c4ba5471")
        private static Stereotype MDAASSOCDEP;

        @objid ("c9a1b301-6091-4c4a-bca4-188b2f17babf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4eb6ea8a-df83-4a4c-81c8-413f61947ebd")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ccb262e3-9755-11e0-94fb-0027103f347c");
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
