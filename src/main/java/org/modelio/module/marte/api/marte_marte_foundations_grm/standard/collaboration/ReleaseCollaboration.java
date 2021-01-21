/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaboration;

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
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Collaboration} with << Release_Collaboration >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("993f9d95-37e2-41f0-b5db-41d5d9fe868c")
public class ReleaseCollaboration extends GrServiceCollaboration {
    @objid ("b7393f9b-3de2-4086-8959-65426f02a71f")
    public static final String STEREOTYPE_NAME = "Release_Collaboration";

    /**
     * Tells whether a {@link ReleaseCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << Release_Collaboration >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b2dae94e-a94e-4433-914b-8c14597593f2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ReleaseCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << Release_Collaboration >> then instantiate a {@link ReleaseCollaboration} proxy.
     * 
     * @return a {@link ReleaseCollaboration} proxy on the created {@link Collaboration}.
     */
    @objid ("5d38a551-4809-431d-9e59-44755b5d1927")
    public static ReleaseCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ReleaseCollaboration.STEREOTYPE_NAME);
        return ReleaseCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link ReleaseCollaboration} proxy from a {@link Collaboration} stereotyped << Release_Collaboration >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link ReleaseCollaboration} proxy or <i>null</i>.
     */
    @objid ("5fa1ec3e-d8f4-4eca-8548-dca7833e8ab7")
    public static ReleaseCollaboration instantiate(final Collaboration obj) {
        return ReleaseCollaboration.canInstantiate(obj) ? new ReleaseCollaboration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ReleaseCollaboration} proxy from a {@link Collaboration} stereotyped << Release_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Collaboration}
     * @return a {@link ReleaseCollaboration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d8f997a3-c031-432c-88f9-45e283fe63d8")
    public static ReleaseCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (ReleaseCollaboration.canInstantiate(obj))
        	return new ReleaseCollaboration(obj);
        else
        	throw new IllegalArgumentException("ReleaseCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("14775ba1-32db-447f-b779-c41b867e0255")
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
        ReleaseCollaboration other = (ReleaseCollaboration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Collaboration}. 
     * @return the Collaboration represented by this proxy, never null.
     */
    @objid ("57d5ba49-3ab1-4b8a-bf23-709956bc7cd5")
    @Override
    public Collaboration getElement() {
        return (Collaboration)super.getElement();
    }

    @objid ("edc4b71f-c1c6-4b4c-9f8f-eb7a9e0d519f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4cad675c-7bda-4939-a5bb-9fb2cb8e229b")
    protected ReleaseCollaboration(final Collaboration elt) {
        super(elt);
    }

    @objid ("7fe9dc50-85eb-469b-96f6-fa289124d99b")
    public static final class MdaTypes {
        @objid ("bda38d8c-78cf-4a75-96ce-a59d4145fb1f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("789f719a-8960-446e-b8b7-a37d119986cf")
        private static Stereotype MDAASSOCDEP;

        @objid ("ae9e74f7-bddc-4e6d-a431-f954b743635b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d8862be8-b8f9-4d42-8267-ee482ad25c28")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3d3258cd-0f30-11df-8c52-0014222a9f79");
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
