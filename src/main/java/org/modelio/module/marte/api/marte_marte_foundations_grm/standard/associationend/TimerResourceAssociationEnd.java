/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << TimerResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("394fe685-b620-46c8-9283-797887c3cddd")
public class TimerResourceAssociationEnd extends TimingResourceAssociationEnd {
    @objid ("f95535c8-cbc8-4308-9fb6-2e4f8e2f1b59")
    public static final String STEREOTYPE_NAME = "TimerResource_AssociationEnd";

    @objid ("ee9c604d-a4b1-4c5e-803d-2d2e47f71205")
    public static final String TIMERRESOURCE_ASSOCIATIONEND_DURATION_TAGTYPE = "TimerResource_AssociationEnd_duration";

    @objid ("dd7a1a8f-4b51-40d3-9f18-197054b2dbd4")
    public static final String TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC_TAGTYPE = "TimerResource_AssociationEnd_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << TimerResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("50eea290-19da-4b55-a306-195893c28f41")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << TimerResource_AssociationEnd >> then instantiate a {@link TimerResourceAssociationEnd} proxy.
     * 
     * @return a {@link TimerResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("73cac3b0-dd4b-456d-b3b2-83be59a20bf1")
    public static TimerResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceAssociationEnd.STEREOTYPE_NAME);
        return TimerResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << TimerResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link TimerResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("97e2a65d-9bcb-4c06-873f-5029b66bbbec")
    public static TimerResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return TimerResourceAssociationEnd.canInstantiate(obj) ? new TimerResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimerResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << TimerResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link TimerResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("247bfd89-f75a-4076-9695-2821e27e5d0e")
    public static TimerResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (TimerResourceAssociationEnd.canInstantiate(obj))
        	return new TimerResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("TimerResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("93b75582-34cb-4c5d-8744-faa2e022ac94")
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
        TimerResourceAssociationEnd other = (TimerResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("943e42bb-aaa5-42a6-a7bf-998a07f62082")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'TimerResource_AssociationEnd_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("42b0855d-40fd-4758-9254-076834d4d1f0")
    public String getTimerResource_AssociationEnd_duration() {
        return this.elt.getTagValue(TimerResourceAssociationEnd.MdaTypes.TIMERRESOURCE_ASSOCIATIONEND_DURATION_TAGTYPE_ELT);
    }

    @objid ("c59ea2f7-70cb-4881-b868-aac31d5771b5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_AssociationEnd_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cddb3ada-50eb-4116-affa-68a3f80043f5")
    public boolean isTimerResource_AssociationEnd_isPeriodic() {
        return this.elt.isTagged(TimerResourceAssociationEnd.MdaTypes.TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_AssociationEnd_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b97a641-f720-4ab3-b381-0f5944eb38cd")
    public void setTimerResource_AssociationEnd_duration(final String value) {
        this.elt.putTagValue(TimerResourceAssociationEnd.MdaTypes.TIMERRESOURCE_ASSOCIATIONEND_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_AssociationEnd_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e3e18a70-3580-4420-8303-40b38390e344")
    public void setTimerResource_AssociationEnd_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceAssociationEnd.MdaTypes.TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceAssociationEnd.MdaTypes.TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC_TAGTYPE_ELT);
    }

    @objid ("e52630bd-2e10-4c59-884a-1307dfdb60fa")
    protected TimerResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("159344e1-bee8-43b9-aa5c-02b934442e69")
    public static final class MdaTypes {
        @objid ("8b7b25a7-4876-4cb0-961a-26dc5d9f026b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("484713f3-e7a3-4afe-a269-6367a4ff80af")
        public static TagType TIMERRESOURCE_ASSOCIATIONEND_DURATION_TAGTYPE_ELT;

        @objid ("04bc4ff8-c616-4ce2-8a4c-d0bbc6d109be")
        public static TagType TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC_TAGTYPE_ELT;

        @objid ("105dcb35-5b50-431b-9bc7-d0b55f8e576d")
        private static Stereotype MDAASSOCDEP;

        @objid ("d4eecccc-fd2e-48c7-95fd-25b5e31dd27d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("87378a3a-f55c-47f6-af64-cd348b8d3943")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00a1abc4-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_ASSOCIATIONEND_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abcb-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abd2-0ccf-11df-8525-001302895b2b");
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
