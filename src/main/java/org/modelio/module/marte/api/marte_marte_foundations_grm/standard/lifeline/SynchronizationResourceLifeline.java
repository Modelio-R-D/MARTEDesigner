/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
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
 * Proxy class to handle a {@link Lifeline} with << SynchronizationResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("966a027b-4e2f-473b-98d2-a84866a65a37")
public class SynchronizationResourceLifeline extends ResourceLifeline {
    @objid ("f61fd2de-a885-4c3f-b660-f298c90fbd9f")
    public static final String STEREOTYPE_NAME = "SynchronizationResource_Lifeline";

    /**
     * Tells whether a {@link SynchronizationResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SynchronizationResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("bade9465-c8d2-4e42-b4ad-3ec07eddc16d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SynchronizationResource_Lifeline >> then instantiate a {@link SynchronizationResourceLifeline} proxy.
     * 
     * @return a {@link SynchronizationResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("9e0d4731-8f05-4c8e-96a3-f2f5dc7987d2")
    public static SynchronizationResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceLifeline.STEREOTYPE_NAME);
        return SynchronizationResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceLifeline} proxy from a {@link Lifeline} stereotyped << SynchronizationResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SynchronizationResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("6cfa59e7-f5ba-429e-9473-26a8a6bf932c")
    public static SynchronizationResourceLifeline instantiate(final Lifeline obj) {
        return SynchronizationResourceLifeline.canInstantiate(obj) ? new SynchronizationResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceLifeline} proxy from a {@link Lifeline} stereotyped << SynchronizationResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SynchronizationResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2323b7a6-aa12-404d-b8e5-36f259eec616")
    public static SynchronizationResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SynchronizationResourceLifeline.canInstantiate(obj))
        	return new SynchronizationResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SynchronizationResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("be7f408e-0b46-4eb5-956f-28d2d2e4276c")
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
        SynchronizationResourceLifeline other = (SynchronizationResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("5867fbca-0dd9-41ab-870f-1246521bc07c")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("d9e96f13-6f5a-485e-8690-b25de2b6209f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("7af9b604-a254-4f62-80f8-3518eca1eb3e")
    protected SynchronizationResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("33c0ade7-2cd2-4372-9631-6de896b12626")
    public static final class MdaTypes {
        @objid ("949b42a2-0a66-44bf-bc3a-2fe7d3d622be")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f415c573-b2ee-4f12-9dd5-1f92ba689331")
        private static Stereotype MDAASSOCDEP;

        @objid ("a3873154-70d9-4a27-b3c1-ca36a531eb12")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b388d873-6325-4e32-8ff1-d09a40412e96")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2bb27773-0f4d-11df-8c52-0014222a9f79");
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
