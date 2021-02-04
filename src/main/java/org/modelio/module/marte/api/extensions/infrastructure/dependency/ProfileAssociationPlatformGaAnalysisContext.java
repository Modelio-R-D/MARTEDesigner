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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_platform_GaAnalysisContext >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("af6e04a0-db6f-47c8-8629-29f093add500")
public class ProfileAssociationPlatformGaAnalysisContext {
    @objid ("10612e66-92a3-47ce-9c83-c91f604d0295")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_platform_GaAnalysisContext";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("415a9ef4-94cc-42e9-8cb7-37d87dbfb9e7")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationPlatformGaAnalysisContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_platform_GaAnalysisContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b50ba676-00f5-4181-8482-f53c3fb2af6b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationPlatformGaAnalysisContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_platform_GaAnalysisContext >> then instantiate a {@link ProfileAssociationPlatformGaAnalysisContext} proxy.
     * 
     * @return a {@link ProfileAssociationPlatformGaAnalysisContext} proxy on the created {@link Dependency}.
     */
    @objid ("28c2078a-e3c4-4dce-9aaa-fcee0450c15e")
    public static ProfileAssociationPlatformGaAnalysisContext create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationPlatformGaAnalysisContext.STEREOTYPE_NAME);
        return ProfileAssociationPlatformGaAnalysisContext.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationPlatformGaAnalysisContext} proxy from a {@link Dependency} stereotyped << ProfileAssociation_platform_GaAnalysisContext >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationPlatformGaAnalysisContext} proxy or <i>null</i>.
     */
    @objid ("9627f1f0-572c-46ed-aaf7-21431787f941")
    public static ProfileAssociationPlatformGaAnalysisContext instantiate(final Dependency obj) {
        return ProfileAssociationPlatformGaAnalysisContext.canInstantiate(obj) ? new ProfileAssociationPlatformGaAnalysisContext(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationPlatformGaAnalysisContext} proxy from a {@link Dependency} stereotyped << ProfileAssociation_platform_GaAnalysisContext >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationPlatformGaAnalysisContext} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0f745803-8289-4010-8a85-86288e1b1f2e")
    public static ProfileAssociationPlatformGaAnalysisContext safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationPlatformGaAnalysisContext.canInstantiate(obj))
        	return new ProfileAssociationPlatformGaAnalysisContext(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationPlatformGaAnalysisContext: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2a0699b5-3456-4ba5-b75c-5d3db9ce3bf2")
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
        ProfileAssociationPlatformGaAnalysisContext other = (ProfileAssociationPlatformGaAnalysisContext) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("97301061-97e2-4563-a863-fad6c130242b")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("1fb5a15a-5f08-4ea0-a9b9-7f7df08bb265")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9ed05dd1-d928-462d-b908-60f82862ad64")
    protected ProfileAssociationPlatformGaAnalysisContext(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("d36d435c-a828-4de3-b735-f0471a7110e9")
    public static final class MdaTypes {
        @objid ("32b0fbe3-f3a8-414d-9246-1c8ca4620f4a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ae1dd31c-8b1c-4cb8-bbda-0163a2731491")
        private static Stereotype MDAASSOCDEP;

        @objid ("abf67912-110e-428e-8852-5bea4f40d328")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a6b3a1db-04f5-4c7c-981f-f0062a9679c8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cf5a8e8d-dd1f-11e0-a2be-0027103f347c");
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
