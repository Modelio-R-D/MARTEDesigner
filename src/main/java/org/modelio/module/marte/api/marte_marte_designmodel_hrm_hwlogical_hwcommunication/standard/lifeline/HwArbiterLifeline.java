/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link Lifeline} with << HwArbiter_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("86ad111b-bf69-45f7-a9fa-02cfced154cf")
public class HwArbiterLifeline extends HwCommunicationResourceLifeline {
    @objid ("4f881995-33cb-4654-9e27-ca8dee0ade99")
    public static final String STEREOTYPE_NAME = "HwArbiter_Lifeline";

    @objid ("dc3e4ddd-078b-4165-93d0-5dbf166aec95")
    public static final String HWARBITER_LIFELINE_CONTROLLEDMEDIAS_TAGTYPE = "HwArbiter_Lifeline_controlledMedias";

    /**
     * Tells whether a {@link HwArbiterLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwArbiter_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("05917101-8ba6-41cb-be05-751ca4795d61")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwArbiter_Lifeline >> then instantiate a {@link HwArbiterLifeline} proxy.
     * 
     * @return a {@link HwArbiterLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("7ad8e9b5-1e80-4a24-a591-cdb4f04734a6")
    public static HwArbiterLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterLifeline.STEREOTYPE_NAME);
        return HwArbiterLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwArbiterLifeline} proxy from a {@link Lifeline} stereotyped << HwArbiter_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwArbiterLifeline} proxy or <i>null</i>.
     */
    @objid ("36a63fd4-4eac-4537-b016-2700a7223741")
    public static HwArbiterLifeline instantiate(final Lifeline obj) {
        return HwArbiterLifeline.canInstantiate(obj) ? new HwArbiterLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwArbiterLifeline} proxy from a {@link Lifeline} stereotyped << HwArbiter_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwArbiterLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("eaaa3388-cfe0-4309-810f-a611dbb45e93")
    public static HwArbiterLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwArbiterLifeline.canInstantiate(obj))
        	return new HwArbiterLifeline(obj);
        else
        	throw new IllegalArgumentException("HwArbiterLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c96219b1-e089-4f93-9673-11387f1bf46e")
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
        HwArbiterLifeline other = (HwArbiterLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("a77fb042-b2d9-458e-b002-b3d42033eafd")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwArbiter_Lifeline_controlledMedias'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("96e31932-05ef-47f7-977f-b789a24bb92c")
    public List<String> getHwArbiter_Lifeline_controlledMedias() {
        return this.elt.getTagValues(HwArbiterLifeline.MdaTypes.HWARBITER_LIFELINE_CONTROLLEDMEDIAS_TAGTYPE_ELT);
    }

    @objid ("2a5c97f0-67ae-4c7f-ab8a-df5874f16b15")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwArbiter_Lifeline_controlledMedias'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db900474-510d-4bd8-b039-019653f1370b")
    public void setHwArbiter_Lifeline_controlledMedias(final List<String> values) {
        this.elt.putTagValues(HwArbiterLifeline.MdaTypes.HWARBITER_LIFELINE_CONTROLLEDMEDIAS_TAGTYPE_ELT, values);
    }

    @objid ("55efb19f-36f0-45d0-ab9c-d969a499f742")
    protected HwArbiterLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("bae23fb5-7744-42d5-b333-75c0f9acb620")
    public static final class MdaTypes {
        @objid ("80fd8b6d-8e9f-437e-b124-c1cedec41c23")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1be64905-cd70-47ae-99fa-693b936a8055")
        public static TagType HWARBITER_LIFELINE_CONTROLLEDMEDIAS_TAGTYPE_ELT;

        @objid ("5d36aa0a-52a0-4e4f-b180-31687ccfc129")
        private static Stereotype MDAASSOCDEP;

        @objid ("23af6479-4638-48d7-b46e-0b1a95536c31")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b4e05656-edac-4780-af5e-f11540469578")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5e6731c7-10ad-11df-81d9-0014222a9f79");
            HWARBITER_LIFELINE_CONTROLLEDMEDIAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5e6731c8-10ad-11df-81d9-0014222a9f79");
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
