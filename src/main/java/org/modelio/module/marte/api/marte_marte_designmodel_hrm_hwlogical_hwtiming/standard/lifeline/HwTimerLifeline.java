/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.lifeline;

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
 * Proxy class to handle a {@link Lifeline} with << HwTimer_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b0fcc718-20bd-4156-ba5d-646d4d1bc137")
public class HwTimerLifeline extends HwTimingResourceLifeline {
    @objid ("9e027365-9fb4-4b0d-aa29-a23dcab6bd0e")
    public static final String STEREOTYPE_NAME = "HwTimer_Lifeline";

    @objid ("7afbb6e9-3441-4941-8fb4-47953211d35a")
    public static final String HWTIMER_LIFELINE_COUNTERWIDTH_TAGTYPE = "HwTimer_Lifeline_counterWidth";

    @objid ("f2077632-7ad2-43d5-83a6-4e50818f5863")
    public static final String HWTIMER_LIFELINE_INPUTCLOCK_TAGTYPE = "HwTimer_Lifeline_inputClock";

    @objid ("83a54442-3a5f-4075-9a77-5555cdae13f8")
    public static final String HWTIMER_LIFELINE_NBCOUNTERS_TAGTYPE = "HwTimer_Lifeline_nbCounters";

    /**
     * Tells whether a {@link HwTimerLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwTimer_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("17e7cd9c-e8a5-4b72-b67b-f847fbf8a86c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwTimer_Lifeline >> then instantiate a {@link HwTimerLifeline} proxy.
     * 
     * @return a {@link HwTimerLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("dc5531f7-4514-4608-9c4d-8f3e24c3ae16")
    public static HwTimerLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerLifeline.STEREOTYPE_NAME);
        return HwTimerLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwTimerLifeline} proxy from a {@link Lifeline} stereotyped << HwTimer_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwTimerLifeline} proxy or <i>null</i>.
     */
    @objid ("7a8bdecb-a529-4d67-aaa5-1f0dae8b577d")
    public static HwTimerLifeline instantiate(final Lifeline obj) {
        return HwTimerLifeline.canInstantiate(obj) ? new HwTimerLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimerLifeline} proxy from a {@link Lifeline} stereotyped << HwTimer_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwTimerLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5964556c-dc0b-45d3-8d3d-a4459308d148")
    public static HwTimerLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwTimerLifeline.canInstantiate(obj))
        	return new HwTimerLifeline(obj);
        else
        	throw new IllegalArgumentException("HwTimerLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2b956441-1cb0-4986-8129-08057fb4fc48")
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
        HwTimerLifeline other = (HwTimerLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("bf7baa91-82ef-4e8f-bdb3-54994c214942")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwTimer_Lifeline_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c8b67119-ff25-425e-b61c-890701280726")
    public String getHwTimer_Lifeline_counterWidth() {
        return this.elt.getTagValue(HwTimerLifeline.MdaTypes.HWTIMER_LIFELINE_COUNTERWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Lifeline_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e7bfc864-9f9f-4034-b37b-c1f88e8e4984")
    public String getHwTimer_Lifeline_inputClock() {
        return this.elt.getTagValue(HwTimerLifeline.MdaTypes.HWTIMER_LIFELINE_INPUTCLOCK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Lifeline_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("97cfa74f-b270-4d91-8406-c65ee29079c9")
    public String getHwTimer_Lifeline_nbCounters() {
        return this.elt.getTagValue(HwTimerLifeline.MdaTypes.HWTIMER_LIFELINE_NBCOUNTERS_TAGTYPE_ELT);
    }

    @objid ("7f983391-4741-45c4-92ca-9ef61122d564")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimer_Lifeline_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7ae6b495-efcd-4103-bce9-29084966dca1")
    public void setHwTimer_Lifeline_counterWidth(final String value) {
        this.elt.putTagValue(HwTimerLifeline.MdaTypes.HWTIMER_LIFELINE_COUNTERWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Lifeline_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("99f395b4-3f1a-4b2f-9880-cf4650a1c69b")
    public void setHwTimer_Lifeline_inputClock(final String value) {
        this.elt.putTagValue(HwTimerLifeline.MdaTypes.HWTIMER_LIFELINE_INPUTCLOCK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Lifeline_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3f1a2082-46d9-48b8-ba97-a2f90e81fcb1")
    public void setHwTimer_Lifeline_nbCounters(final String value) {
        this.elt.putTagValue(HwTimerLifeline.MdaTypes.HWTIMER_LIFELINE_NBCOUNTERS_TAGTYPE_ELT, value);
    }

    @objid ("b9d221fd-555a-4fe7-ad7a-7faf37f82c31")
    protected HwTimerLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("d2ec3983-72f7-4fcd-a4c5-b323900eefba")
    public static final class MdaTypes {
        @objid ("6dab5fc1-1d76-458a-bc8c-f91527a432e3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("461759a9-32d8-4041-b283-3a9b2e67e479")
        public static TagType HWTIMER_LIFELINE_NBCOUNTERS_TAGTYPE_ELT;

        @objid ("a26db5c1-83d7-4f89-b2fb-41d95f60978f")
        public static TagType HWTIMER_LIFELINE_COUNTERWIDTH_TAGTYPE_ELT;

        @objid ("07e4cc93-dda2-434a-9d02-a74b8246df65")
        public static TagType HWTIMER_LIFELINE_INPUTCLOCK_TAGTYPE_ELT;

        @objid ("c1f78370-3738-4332-b2e8-18d171d9149a")
        private static Stereotype MDAASSOCDEP;

        @objid ("2dc3a338-97ea-4080-9dbe-fd109a1514fb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e7a9306f-5a7f-4b40-a7dd-3817a81a25da")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4e81ab53-10af-11df-81d9-0014222a9f79");
            HWTIMER_LIFELINE_NBCOUNTERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e81ab55-10af-11df-81d9-0014222a9f79");
            HWTIMER_LIFELINE_COUNTERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e81ab54-10af-11df-81d9-0014222a9f79");
            HWTIMER_LIFELINE_INPUTCLOCK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e81ab56-10af-11df-81d9-0014222a9f79");
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
