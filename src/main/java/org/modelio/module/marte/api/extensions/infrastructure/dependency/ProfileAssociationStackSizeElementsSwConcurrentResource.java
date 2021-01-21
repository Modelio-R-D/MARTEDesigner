/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_stackSizeElements_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("36b69b17-94e0-4bd4-89e4-cd5da6b815f0")
public class ProfileAssociationStackSizeElementsSwConcurrentResource {
    @objid ("9e59809d-59a4-4de6-b450-91f40f122884")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_stackSizeElements_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("35290350-0f50-4b92-970a-94c0f7c26d7c")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationStackSizeElementsSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_stackSizeElements_SwConcurrentResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("62b95adf-104c-4161-a0eb-c10481ac88c6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationStackSizeElementsSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_stackSizeElements_SwConcurrentResource >> then instantiate a {@link ProfileAssociationStackSizeElementsSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationStackSizeElementsSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("8a3af7b4-59cc-4cc9-a070-2990324110a6")
    public static ProfileAssociationStackSizeElementsSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationStackSizeElementsSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationStackSizeElementsSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationStackSizeElementsSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_stackSizeElements_SwConcurrentResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationStackSizeElementsSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("2fc8d7f2-4d48-4a28-a5b8-ec31d2e45478")
    public static ProfileAssociationStackSizeElementsSwConcurrentResource instantiate(final Dependency obj) {
        return ProfileAssociationStackSizeElementsSwConcurrentResource.canInstantiate(obj) ? new ProfileAssociationStackSizeElementsSwConcurrentResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationStackSizeElementsSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_stackSizeElements_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationStackSizeElementsSwConcurrentResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7ba2e1c4-0425-4c67-a932-2c8ab866028b")
    public static ProfileAssociationStackSizeElementsSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationStackSizeElementsSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationStackSizeElementsSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationStackSizeElementsSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c320eb8f-5610-464b-be7a-61a2b9e71275")
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
        ProfileAssociationStackSizeElementsSwConcurrentResource other = (ProfileAssociationStackSizeElementsSwConcurrentResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("59861f91-8404-43f4-ae22-6f56199256bf")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("bb302045-588c-4b00-b9e2-33849943a4f5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5c6d5f81-ab19-462b-8c71-851e7240d653")
    protected ProfileAssociationStackSizeElementsSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("0a662416-177b-4383-8649-56be13027356")
    public static final class MdaTypes {
        @objid ("61ef9a36-3a4d-4ee5-88d8-21acbb67ba0b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("84032562-6911-4e6e-838c-1a9a1457e289")
        private static Stereotype MDAASSOCDEP;

        @objid ("ac607794-b4ca-4efb-a45d-e07992ba236e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("535b98bd-c47b-4a62-a640-7da1c2a7760a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "655dca73-9756-11e0-94fb-0027103f347c");
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
