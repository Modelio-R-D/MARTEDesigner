/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwTimer_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("165ae1c3-6982-4576-85fa-91e09d39a76d")
public class HwTimerAssociation extends HwTimingResourceAssociation {
    @objid ("31528847-cbba-42cc-9efa-781db9e190a4")
    public static final String STEREOTYPE_NAME = "HwTimer_Association";

    @objid ("8a435070-ce5c-429b-9e07-8ab7f82625c9")
    public static final String HWTIMER_ASSOCIATION_COUNTERWIDTH_TAGTYPE = "HwTimer_Association_counterWidth";

    @objid ("8f76ffa8-472d-4c32-8c78-8654dc05d20e")
    public static final String HWTIMER_ASSOCIATION_INPUTCLOCK_TAGTYPE = "HwTimer_Association_inputClock";

    @objid ("dc598a78-d21f-4adf-b9a0-25dee5af09e6")
    public static final String HWTIMER_ASSOCIATION_NBCOUNTERS_TAGTYPE = "HwTimer_Association_nbCounters";

    /**
     * Tells whether a {@link HwTimerAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwTimer_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ca300485-bdc5-41df-981e-d7924224f171")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwTimer_Association >> then instantiate a {@link HwTimerAssociation} proxy.
     * 
     * @return a {@link HwTimerAssociation} proxy on the created {@link Association}.
     */
    @objid ("4eb49f91-82a3-4061-b200-227da05339b0")
    public static HwTimerAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerAssociation.STEREOTYPE_NAME);
        return HwTimerAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwTimerAssociation} proxy from a {@link Association} stereotyped << HwTimer_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwTimerAssociation} proxy or <i>null</i>.
     */
    @objid ("7b5ad3dd-e5db-4976-83a2-c277a971398d")
    public static HwTimerAssociation instantiate(final Association obj) {
        return HwTimerAssociation.canInstantiate(obj) ? new HwTimerAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimerAssociation} proxy from a {@link Association} stereotyped << HwTimer_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwTimerAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c7a3b8e1-aa13-44d7-8136-dcc9db8ede6c")
    public static HwTimerAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwTimerAssociation.canInstantiate(obj))
        	return new HwTimerAssociation(obj);
        else
        	throw new IllegalArgumentException("HwTimerAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("24b072e2-1fec-4f5f-a39e-5b8e1221b719")
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
        HwTimerAssociation other = (HwTimerAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("fedeeffa-5619-41a9-8274-fa2bcfd73403")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwTimer_Association_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2fc8ea8b-7f8f-4f2c-bdbc-8e3064d64538")
    public String getHwTimer_Association_counterWidth() {
        return this.elt.getTagValue(HwTimerAssociation.MdaTypes.HWTIMER_ASSOCIATION_COUNTERWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Association_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("40f077ef-8247-4e43-bbb9-9e8cfbced0b9")
    public String getHwTimer_Association_inputClock() {
        return this.elt.getTagValue(HwTimerAssociation.MdaTypes.HWTIMER_ASSOCIATION_INPUTCLOCK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Association_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8288f6cc-83cf-446f-812b-840e506974e0")
    public String getHwTimer_Association_nbCounters() {
        return this.elt.getTagValue(HwTimerAssociation.MdaTypes.HWTIMER_ASSOCIATION_NBCOUNTERS_TAGTYPE_ELT);
    }

    @objid ("fb74c405-37a3-432a-b116-c26781cc3d51")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimer_Association_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c350a35a-c0df-4fb7-a94b-490215b61b76")
    public void setHwTimer_Association_counterWidth(final String value) {
        this.elt.putTagValue(HwTimerAssociation.MdaTypes.HWTIMER_ASSOCIATION_COUNTERWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Association_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("153e3495-5df9-4b47-a347-30f3ca98c06f")
    public void setHwTimer_Association_inputClock(final String value) {
        this.elt.putTagValue(HwTimerAssociation.MdaTypes.HWTIMER_ASSOCIATION_INPUTCLOCK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Association_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1c6f6260-b3c9-495f-8f3f-860f74111f01")
    public void setHwTimer_Association_nbCounters(final String value) {
        this.elt.putTagValue(HwTimerAssociation.MdaTypes.HWTIMER_ASSOCIATION_NBCOUNTERS_TAGTYPE_ELT, value);
    }

    @objid ("d69f80cb-0f71-4296-88eb-7f9d39552091")
    protected HwTimerAssociation(final Association elt) {
        super(elt);
    }

    @objid ("f9b8d70d-64f5-4737-821f-4f276bc6097f")
    public static final class MdaTypes {
        @objid ("136cf614-7357-4212-917a-06e5c2031611")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4a4b2627-3dea-428e-a776-aa3a95a9cdb7")
        public static TagType HWTIMER_ASSOCIATION_NBCOUNTERS_TAGTYPE_ELT;

        @objid ("d1345c0c-4914-4d2b-87a2-3bc013abf249")
        public static TagType HWTIMER_ASSOCIATION_COUNTERWIDTH_TAGTYPE_ELT;

        @objid ("086dbb51-6f70-4ef5-9489-175e0cac038e")
        public static TagType HWTIMER_ASSOCIATION_INPUTCLOCK_TAGTYPE_ELT;

        @objid ("bb3ecb0b-58d2-4eeb-bfa1-a589c40e28b9")
        private static Stereotype MDAASSOCDEP;

        @objid ("a41c583a-006e-420f-8a36-289ba9186289")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("66609814-69b1-44cf-a23a-ac175fb8f9bc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4e67715f-10af-11df-81d9-0014222a9f79");
            HWTIMER_ASSOCIATION_NBCOUNTERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e677161-10af-11df-81d9-0014222a9f79");
            HWTIMER_ASSOCIATION_COUNTERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e677160-10af-11df-81d9-0014222a9f79");
            HWTIMER_ASSOCIATION_INPUTCLOCK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e677162-10af-11df-81d9-0014222a9f79");
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
