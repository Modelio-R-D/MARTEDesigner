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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_platform_GaAnalysisContext >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("af6e04a0-db6f-47c8-8629-29f093add500")
public class ProfileAssociationPlatformGaAnalysisContext {
    @objid ("9a8cf52b-8dd8-4b56-bd8b-d52ab05cf21a")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_platform_GaAnalysisContext";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("27ae615d-f501-41ce-99eb-4a74b64ce71d")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationPlatformGaAnalysisContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_platform_GaAnalysisContext >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c38fd673-55e8-4078-bebe-171b08249a1a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationPlatformGaAnalysisContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_platform_GaAnalysisContext >> then instantiate a {@link ProfileAssociationPlatformGaAnalysisContext} proxy.
     * 
     * @return a {@link ProfileAssociationPlatformGaAnalysisContext} proxy on the created {@link Dependency}.
     */
    @objid ("75308210-8324-4492-aa30-1c9a93a2b438")
    public static ProfileAssociationPlatformGaAnalysisContext create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationPlatformGaAnalysisContext.STEREOTYPE_NAME);
        return ProfileAssociationPlatformGaAnalysisContext.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationPlatformGaAnalysisContext} proxy from a {@link Dependency} stereotyped << ProfileAssociation_platform_GaAnalysisContext >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationPlatformGaAnalysisContext} proxy or <i>null</i>.
     */
    @objid ("c3093da6-94c0-44a2-acfc-e20507780199")
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
    @objid ("2b503e0b-898d-4a43-a7ca-97e9d7b58e36")
    public static ProfileAssociationPlatformGaAnalysisContext safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationPlatformGaAnalysisContext.canInstantiate(obj))
        	return new ProfileAssociationPlatformGaAnalysisContext(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationPlatformGaAnalysisContext: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ea7dad74-f28f-40de-831f-dce00ea139c6")
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
    @objid ("2441c4ad-70ce-4118-8af2-db61b41b9d48")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("ea6fa090-6a09-42b1-add2-aa5a70670c0d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("90a1c51a-6aab-4568-9f9a-e9d07ddd4ced")
    protected ProfileAssociationPlatformGaAnalysisContext(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("d36d435c-a828-4de3-b735-f0471a7110e9")
    public static final class MdaTypes {
        @objid ("136c173c-bb34-4de9-921d-cd1f9603f255")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6fc0bb13-1ebc-46de-8fee-53b6c5271bd9")
        private static Stereotype MDAASSOCDEP;

        @objid ("76c9f7f8-ef84-40db-a0e6-6d1e0fe6491b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7173087a-efc2-4bad-a43a-4e0be0afddbc")
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
