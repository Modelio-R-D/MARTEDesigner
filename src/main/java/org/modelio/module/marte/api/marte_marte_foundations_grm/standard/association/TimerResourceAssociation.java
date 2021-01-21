/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
 * Proxy class to handle a {@link Association} with << TimerResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6908a8e5-8b9e-40d5-8b70-65b90b7d106a")
public class TimerResourceAssociation extends TimingResourceAssociation {
    @objid ("2aa99b60-834b-4ed8-82e2-1239c571c37b")
    public static final String STEREOTYPE_NAME = "TimerResource_Association";

    @objid ("75f099fd-8c3d-4d41-8c4b-f415a8809517")
    public static final String TIMERRESOURCE_ASSOCIATION_DURATION_TAGTYPE = "TimerResource_Association_duration";

    @objid ("78ff728e-6245-4f1a-b1c1-ac1875a68545")
    public static final String TIMERRESOURCE_ASSOCIATION_ISPERIODIC_TAGTYPE = "TimerResource_Association_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << TimerResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("607604cd-1e7d-4019-b083-9dc4d67073b8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << TimerResource_Association >> then instantiate a {@link TimerResourceAssociation} proxy.
     * 
     * @return a {@link TimerResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("9ac8bdeb-15e0-46da-ac78-7ce15f75d6e1")
    public static TimerResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceAssociation.STEREOTYPE_NAME);
        return TimerResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceAssociation} proxy from a {@link Association} stereotyped << TimerResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link TimerResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("5a96cfe1-9890-40d9-8c03-c8778fab1aeb")
    public static TimerResourceAssociation instantiate(final Association obj) {
        return TimerResourceAssociation.canInstantiate(obj) ? new TimerResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimerResourceAssociation} proxy from a {@link Association} stereotyped << TimerResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link TimerResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9acab96b-5ad6-4c7a-82d5-c7e2ea415077")
    public static TimerResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (TimerResourceAssociation.canInstantiate(obj))
        	return new TimerResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("TimerResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("860aa14b-2ef5-49ac-857a-6ae3b50fc3d9")
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
        TimerResourceAssociation other = (TimerResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("021ba982-9399-45fc-80dd-4acfa6ceb9fc")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'TimerResource_Association_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("637ad335-e882-4653-88b6-5bae30a10901")
    public String getTimerResource_Association_duration() {
        return this.elt.getTagValue(TimerResourceAssociation.MdaTypes.TIMERRESOURCE_ASSOCIATION_DURATION_TAGTYPE_ELT);
    }

    @objid ("f88b7bbf-c863-4b87-96b1-c9b842f8264c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_Association_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5b32980a-ca42-4e34-baeb-5a085fc9f09f")
    public boolean isTimerResource_Association_isPeriodic() {
        return this.elt.isTagged(TimerResourceAssociation.MdaTypes.TIMERRESOURCE_ASSOCIATION_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_Association_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0c37910c-07f0-4223-9809-0f78c62c3b6d")
    public void setTimerResource_Association_duration(final String value) {
        this.elt.putTagValue(TimerResourceAssociation.MdaTypes.TIMERRESOURCE_ASSOCIATION_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_Association_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("669a68a4-a6a6-4fa9-bb82-917cf45a030b")
    public void setTimerResource_Association_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceAssociation.MdaTypes.TIMERRESOURCE_ASSOCIATION_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceAssociation.MdaTypes.TIMERRESOURCE_ASSOCIATION_ISPERIODIC_TAGTYPE_ELT);
    }

    @objid ("9f105264-5bb8-45fe-819b-7a3baacdd2c3")
    protected TimerResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("527af621-6682-4ba7-8054-345b8c3b7735")
    public static final class MdaTypes {
        @objid ("bf02cdfa-397b-4625-a220-fbe6f2d7736f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("40032aac-115a-4246-a2df-49cc928d608d")
        public static TagType TIMERRESOURCE_ASSOCIATION_DURATION_TAGTYPE_ELT;

        @objid ("b71475cd-a3ae-40fd-9215-648020ecf166")
        public static TagType TIMERRESOURCE_ASSOCIATION_ISPERIODIC_TAGTYPE_ELT;

        @objid ("fc39f15d-ff37-4077-aff3-02bba456e4cd")
        private static Stereotype MDAASSOCDEP;

        @objid ("974b5b5b-4c4d-45e1-b361-cf3fe3d95a3d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("27e89ba0-7f7e-43bb-84e6-76dde9373243")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4b33ab09-0f4c-11df-8c52-0014222a9f79");
            TIMERRESOURCE_ASSOCIATION_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7f668d3e-14c6-11df-92f7-001302895b2b");
            TIMERRESOURCE_ASSOCIATION_ISPERIODIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85e1fcce-14c6-11df-92f7-001302895b2b");
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
