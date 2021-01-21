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
 * Proxy class to handle a {@link Lifeline} with << TimingResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e1ac3822-60e8-430d-bcd1-1116b1484e42")
public class TimingResourceLifeline extends ResourceLifeline {
    @objid ("788ba1bb-5714-42eb-af2b-027b4f2fc8ea")
    public static final String STEREOTYPE_NAME = "TimingResource_Lifeline";

    /**
     * Tells whether a {@link TimingResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << TimingResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9cfb44dd-236a-4c41-bcfd-d9fa2695d0ec")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimingResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << TimingResource_Lifeline >> then instantiate a {@link TimingResourceLifeline} proxy.
     * 
     * @return a {@link TimingResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("b3ddab98-bc24-4d8f-ac6c-86c9fa8f03be")
    public static TimingResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimingResourceLifeline.STEREOTYPE_NAME);
        return TimingResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link TimingResourceLifeline} proxy from a {@link Lifeline} stereotyped << TimingResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link TimingResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("3f05071a-a2b3-4e96-a0fb-812a5ea8373b")
    public static TimingResourceLifeline instantiate(final Lifeline obj) {
        return TimingResourceLifeline.canInstantiate(obj) ? new TimingResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimingResourceLifeline} proxy from a {@link Lifeline} stereotyped << TimingResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link TimingResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("14f82325-23c8-40c6-ac19-4e0e8be4a6e1")
    public static TimingResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (TimingResourceLifeline.canInstantiate(obj))
        	return new TimingResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("TimingResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("029c684b-767d-40a3-9bf5-4abe982acfe2")
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
        TimingResourceLifeline other = (TimingResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("17c9204a-22cd-41de-8e78-d6be33763701")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("b204706c-613e-4856-90e7-d0863e7ec2d2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e2746bbe-c330-47a9-a169-d2aae58dc72b")
    protected TimingResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("5a8d276f-49ab-4b80-ae4c-28e6fa78e581")
    public static final class MdaTypes {
        @objid ("4efea3d2-fbb8-4865-9ced-9cfac6aa59d4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ef983204-a0d4-4ce8-ad8c-8a0f76ef6255")
        private static Stereotype MDAASSOCDEP;

        @objid ("4ee8a2d8-5256-48f5-8d19-a314b01fc0c7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9dae1470-7660-4536-bcd5-dc1b61667d5c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "588952b9-0f4b-11df-8c52-0014222a9f79");
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
