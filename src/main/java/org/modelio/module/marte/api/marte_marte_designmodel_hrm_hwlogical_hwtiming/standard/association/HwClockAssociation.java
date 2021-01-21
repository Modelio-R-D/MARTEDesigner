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
 * Proxy class to handle a {@link Association} with << HwClock_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("866d9413-ad9f-4528-af65-fb3a3336d4cc")
public class HwClockAssociation extends HwTimingResourceAssociation {
    @objid ("cb281d25-ee81-40e8-bc41-42a178e86fcd")
    public static final String STEREOTYPE_NAME = "HwClock_Association";

    @objid ("165f865c-5ebf-4d73-bbaf-6c8e01ba3ef0")
    public static final String HWCLOCK_ASSOCIATION_FREQUENCY_TAGTYPE = "HwClock_Association_frequency";

    /**
     * Tells whether a {@link HwClockAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwClock_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2bbd2052-7a58-4679-8e7f-b2ed5494c04d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwClockAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwClock_Association >> then instantiate a {@link HwClockAssociation} proxy.
     * 
     * @return a {@link HwClockAssociation} proxy on the created {@link Association}.
     */
    @objid ("b61ba186-19f9-4f75-9dd9-836dbe1b2546")
    public static HwClockAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwClockAssociation.STEREOTYPE_NAME);
        return HwClockAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwClockAssociation} proxy from a {@link Association} stereotyped << HwClock_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwClockAssociation} proxy or <i>null</i>.
     */
    @objid ("a987662b-be5e-4d91-8a9a-79a78f3ca020")
    public static HwClockAssociation instantiate(final Association obj) {
        return HwClockAssociation.canInstantiate(obj) ? new HwClockAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwClockAssociation} proxy from a {@link Association} stereotyped << HwClock_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwClockAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a4a0bed1-6822-4472-9401-6fb5bf253b95")
    public static HwClockAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwClockAssociation.canInstantiate(obj))
        	return new HwClockAssociation(obj);
        else
        	throw new IllegalArgumentException("HwClockAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1b6af6f6-dc15-426b-b7c6-98be530d20a3")
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
        HwClockAssociation other = (HwClockAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("46832239-f6e5-4ece-bfc7-9540590587d7")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwClock_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d731e926-12c6-412f-af51-d95ff946a81a")
    public String getHwClock_Association_frequency() {
        return this.elt.getTagValue(HwClockAssociation.MdaTypes.HWCLOCK_ASSOCIATION_FREQUENCY_TAGTYPE_ELT);
    }

    @objid ("95235e96-677c-4d9a-9c68-ecf6a34db1a6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwClock_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9b52a4ac-472c-446e-8615-c1eac6ec7734")
    public void setHwClock_Association_frequency(final String value) {
        this.elt.putTagValue(HwClockAssociation.MdaTypes.HWCLOCK_ASSOCIATION_FREQUENCY_TAGTYPE_ELT, value);
    }

    @objid ("da9fcdd3-e809-441c-9f5d-8f959b8b9f46")
    protected HwClockAssociation(final Association elt) {
        super(elt);
    }

    @objid ("82c2fe99-8fde-4161-9afb-67dac2e55574")
    public static final class MdaTypes {
        @objid ("481e8d9c-ff2b-492a-9152-8b2021bb6f5e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3bd04764-ce30-4f83-a3cf-d9b3fd1e7533")
        public static TagType HWCLOCK_ASSOCIATION_FREQUENCY_TAGTYPE_ELT;

        @objid ("3a61b430-c954-4323-964d-257f1b7fbaaf")
        private static Stereotype MDAASSOCDEP;

        @objid ("e22f8e9c-1fb9-462e-9bd1-2cba1e4f7ecd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("975425a8-cd07-447e-a0f2-4d3a37204bc6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "612a8492-10ae-11df-81d9-0014222a9f79");
            HWCLOCK_ASSOCIATION_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fa41a14e-123c-11df-8f55-0014222a9f79");
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
